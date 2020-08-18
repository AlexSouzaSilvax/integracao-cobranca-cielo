package pagamentoCielo;

import pagamentoCielo.CartaoCredito.CartaoCredito;
import pagamentoCielo.CartaoCredito.CartaoCreditoService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author Alex
 */
public class Teste {

    public static void main(String[] args) throws Exception {
        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.setNossoNumero("000000000000-0");
        cartaoCredito.setNomeUsuario("Dona Maria");
        cartaoCredito.setValor(1);
        cartaoCredito.setCardNumber("0000000000000000");
        cartaoCredito.setSecurityCode("000");
        cartaoCredito.setBrand("BANDEIRA");
        cartaoCredito.setExpirationDate("00/0000");
        cartaoCredito.setQtdParcelas("0");
        CartaoCreditoService cartaoCreditoService = new CartaoCreditoService();
        cartaoCreditoService.pagarComCartaoCredito(cartaoCredito);

    }
}
