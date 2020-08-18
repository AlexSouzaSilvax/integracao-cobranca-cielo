package pagamentoCielo.CartaoCredito;

import java.io.IOException;

import pagamentoCielo.cieloecommerce.sdk.Merchant;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.CieloEcommerce;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.Customer;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.Environment;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.Payment;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.Sale;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.CieloError;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.CieloRequestException;

public class CartaoCreditoService {

    private final String merchantId = "00000000-0000-0000-0000-000000000000";
    private final String merchantKey = "0000000000000000000000000000000000000000";

    // T = SANDBOX - DESENVOLVIMENTO
    // P = PRODUCAO - PRODUCAO
    private String ambiente = "P";

    public void pagarComCartaoCredito(CartaoCredito cartaoCredito) {

        // Efetua venda com cartao:
        Merchant merchant = new Merchant(merchantId, merchantKey);

        // Crie uma instância de Sale informando o ID do pagamento:
        Sale sale = new Sale(cartaoCredito.getNossoNumero());

        // Crie uma instância de Customer informando o nome do cliente:
        Customer customer = sale.customer(cartaoCredito.getNomeUsuario());

        // Crie uma instância de Payment informando o valor do pagamento
        Payment payment = sale.payment(cartaoCredito.getValor());

        // Crie  uma instância de Credit Card utilizando os dados de teste. Esses dados estão disponíveis no manual de integração:
        payment.creditCard(cartaoCredito.getSecurityCode(),
                cartaoCredito.getBrand())
                .setExpirationDate(cartaoCredito.getExpirationDate())
                .setCardNumber(cartaoCredito.getCardNumber());
        payment.setCapture(true);

        if (cartaoCredito.getQtdParcelas() == null) {
            payment.setInstallments(1);
        } else {
            payment.setInstallments(new Integer(cartaoCredito.getQtdParcelas()));
        }

        try {
            // Cria o pagamento na Cielo:
            // Configura o SDK com seu merchant e o ambiente apropriado para criar a venda:
            //Environment.PRODUCTION || Environment.SANDBOX
            sale = new CieloEcommerce(merchant, Environment.PRODUCTION).createSale(sale);

            // Com a venda criada na Cielo, já temos o ID do pagamento, TID e demais
            // dados retornados pela Cielo
            CartaoCredito saleOutputBean = new CartaoCredito();
            saleOutputBean.setCardNumber(sale.getPayment().getCreditCard().getCardNumber());
            saleOutputBean.setType(sale.getPayment().getType().name());
            saleOutputBean.settId(sale.getPayment().getTid());

            System.out.println("---------------------> RETORNO: getCardNumber: " + saleOutputBean.getCardNumber());
            System.out.println("---------------------> RETORNO: getType " + saleOutputBean.getType());
            System.out.println("---------------------> RETORNO: gettId " + saleOutputBean.gettId());

        } catch (CieloRequestException ex) {
            CieloError error = ex.getError();
            System.out.println("Ocorreu um erro Cielo ao realizar o pagamento: " + error.getMessage());
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro IO ao realizar o pagamento: " + ex.getMessage());
        }

    }
}
