package pagamentoCielo.cieloecommerce.sdk.ecommerce.request;

import pagamentoCielo.cieloecommerce.sdk.Environment;
import pagamentoCielo.cieloecommerce.sdk.Merchant;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.RecurrentSale;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPut;

import java.io.IOException;

public class DeactivateRecurrentSaleRequest extends AbstractSaleRequest<String, RecurrentSale> {
    public DeactivateRecurrentSaleRequest(Merchant merchant, Environment environment) {
        super(merchant, environment);
    }

    @Override
    public RecurrentSale execute(String recurrentPaymentId) throws IOException, CieloRequestException {
        String url = environment.getApiUrl() + "1/RecurrentPayment/" + recurrentPaymentId + "/Deactivate";

        HttpPut request = new HttpPut(url);
        HttpResponse response = sendRequest(request);

        return readResponse(response, RecurrentSale.class);
    }
}
