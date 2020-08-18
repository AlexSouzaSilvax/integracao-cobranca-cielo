package pagamentoCielo.cieloecommerce.sdk.ecommerce.request;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

import pagamentoCielo.cieloecommerce.sdk.Environment;
import pagamentoCielo.cieloecommerce.sdk.Merchant;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.Sale;

/**
 * Query a Sale by it's paymentId
 */
public class QuerySaleRequest extends AbstractSaleRequest<String, Sale> {
	public QuerySaleRequest(Merchant merchant, Environment environment) {
		super(merchant, environment);
	}

	@Override
	public Sale execute(String paymentId) throws IOException, CieloRequestException {
		String url = environment.getApiQueryURL() + "1/sales/" + paymentId;

		HttpGet request = new HttpGet(url);
		HttpResponse response = sendRequest(request);

		return readResponse(response, Sale.class);
	}
}
