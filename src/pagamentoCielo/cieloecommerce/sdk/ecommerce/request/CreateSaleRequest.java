package pagamentoCielo.cieloecommerce.sdk.ecommerce.request;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import com.google.gson.GsonBuilder;

import pagamentoCielo.cieloecommerce.sdk.Environment;
import pagamentoCielo.cieloecommerce.sdk.Merchant;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.Sale;

/**
 * Create any kind of sale
 */
public class CreateSaleRequest extends AbstractSaleRequest<Sale, Sale> {

    public CreateSaleRequest(Merchant merchant, Environment environment) {
        super(merchant, environment);
    }

    @Override
    public Sale execute(Sale param) throws IOException, CieloRequestException {
        String url = environment.getApiUrl() + "1/sales/";
        HttpPost request = new HttpPost(url);

        request.setEntity(new StringEntity(new GsonBuilder().create().toJson(param)));

        HttpResponse response = sendRequest(request);

        return readResponse(response, Sale.class);
    }
}
