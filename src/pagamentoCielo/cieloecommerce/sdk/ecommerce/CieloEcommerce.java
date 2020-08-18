package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.QueryMerchantOrderRequest;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.DeactivateRecurrentSaleRequest;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.QuerySaleRequest;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.CieloRequestException;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.QueryRecurrentSaleRequest;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.CreateCartTokenRequest;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.UpdateSaleRequest;
import pagamentoCielo.cieloecommerce.sdk.ecommerce.request.CreateSaleRequest;
import pagamentoCielo.cieloecommerce.sdk.Merchant;
import org.apache.http.client.HttpClient;

import java.io.IOException;

/**
 * The Cielo Ecommerce SDK front-end;
 */
public class CieloEcommerce {

    private final Merchant merchant;
    private final Environment environment;
    private HttpClient httpClient;

    /**
     * Create an instance of CieloEcommerce choosing the environment where the
     * requests will be send
     *
     * @param merchant The merchant credentials
     * @param environment The environment: {@link Environment#PRODUCTION} or
     * {@link Environment#SANDBOX}
     */
    public CieloEcommerce(Merchant merchant, Environment environment) {
        this.merchant = merchant;
        this.environment = environment;
    }

    /**
     * Create an instance of CieloEcommerce to work on production environment
     *
     * @param merchant The merchant credentials
     */
    public CieloEcommerce(Merchant merchant) {
        this(merchant, Environment.PRODUCTION);
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    /**
     * Send the Sale to be created and return the Sale with tid and the status
     * returned by Cielo.
     *
     * @param sale The preconfigured Sale
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public Sale createSale(Sale sale) throws IOException, CieloRequestException {
        CreateSaleRequest createSaleRequest = new CreateSaleRequest(merchant, environment);

        createSaleRequest.setHttpClient(httpClient);

        sale = createSaleRequest.execute(sale);

        return sale;
    }

    /**
     * Create a card token to be stored on store
     *
     * @param cardToken The credit card data
     * @return The card token
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public CardToken createCardToken(CardToken cardToken) throws IOException, CieloRequestException {
        CreateCartTokenRequest createCartTokenRequest = new CreateCartTokenRequest(merchant, environment);

        createCartTokenRequest.setHttpClient(httpClient);

        cardToken = createCartTokenRequest.execute(cardToken);

        return cardToken;
    }

    /**
     * Query a Sale on Cielo by paymentId
     *
     * @param paymentId The paymentId to be queried
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public Sale querySale(String paymentId) throws IOException, CieloRequestException {
        QuerySaleRequest querySaleRequest = new QuerySaleRequest(merchant, environment);

        querySaleRequest.setHttpClient(httpClient);

        Sale sale = querySaleRequest.execute(paymentId);

        return sale;
    }

    /**
     * Query a Sale on Cielo by paymentId
     *
     * @param paymentId The paymentId to be queried
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public QueryMerchantOrderResponse queryMerchantOrder(String merchantOrderId) throws IOException, CieloRequestException {
        QueryMerchantOrderRequest querySaleRequest = new QueryMerchantOrderRequest(merchant, environment);

        querySaleRequest.setHttpClient(httpClient);

        QueryMerchantOrderResponse merchantOrder = querySaleRequest.execute(merchantOrderId);

        return merchantOrder;
    }

    /**
     * Query a RecurrentSale on Cielo by recurrentPaymentId
     *
     * @param recurrentPaymentId The paymentId to be queried
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public RecurrentSale queryRecurrentSale(String recurrentPaymentId) throws IOException, CieloRequestException {
        QueryRecurrentSaleRequest queryRecurrentSaleRequest = new QueryRecurrentSaleRequest(merchant, environment);

        queryRecurrentSaleRequest.setHttpClient(httpClient);

        RecurrentSale recurrentSale = queryRecurrentSaleRequest.execute(recurrentPaymentId);

        return recurrentSale;
    }

    /**
     * Deactivate a RecurrentSale on Cielo by recurrentPaymentId
     *
     * @param recurrentPaymentId The paymentId to be deactivated
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public void deactivateRecurrentSale(String recurrentPaymentId) throws IOException, CieloRequestException {
        DeactivateRecurrentSaleRequest deactivateRecurrentSaleRequest = new DeactivateRecurrentSaleRequest(merchant, environment);

        deactivateRecurrentSaleRequest.setHttpClient(httpClient);

        deactivateRecurrentSaleRequest.execute(recurrentPaymentId);
    }

    /**
     * Cancel a Sale on Cielo by paymentId and speficying the amount
     *
     * @param paymentId The paymentId to be queried
     * @param amount Order value in cents
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public SaleResponse cancelSale(String paymentId, Integer amount) throws IOException, CieloRequestException {
        UpdateSaleRequest updateSaleRequest = new UpdateSaleRequest("void", merchant, environment);

        updateSaleRequest.setHttpClient(httpClient);
        updateSaleRequest.setAmount(amount);

        SaleResponse sale = updateSaleRequest.execute(paymentId);

        return sale;
    }

    /**
     * Cancel a Sale on Cielo by paymentId
     *
     * @param paymentId The paymentId to be queried
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public SaleResponse cancelSale(String paymentId) throws IOException, CieloRequestException {
        return cancelSale(paymentId, null);
    }

    /**
     * Capture a Sale on Cielo by paymentId and specifying the amount and the
     * serviceTaxAmount
     *
     * @param paymentId The paymentId to be captured
     * @param amount Amount of the authorization to be captured
     * @param serviceTaxAmount Amount of the authorization should be destined
     * for the service charge
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public SaleResponse captureSale(String paymentId, Integer amount, Integer serviceTaxAmount)
            throws IOException, CieloRequestException {
        UpdateSaleRequest updateSaleRequest = new UpdateSaleRequest("capture", merchant, environment);

        updateSaleRequest.setHttpClient(httpClient);
        updateSaleRequest.setAmount(amount);
        updateSaleRequest.setServiceTaxAmount(serviceTaxAmount);

        SaleResponse sale = updateSaleRequest.execute(paymentId);

        return sale;
    }

    /**
     * Capture a Sale on Cielo by paymentId and specifying the amount
     *
     * @param paymentId The paymentId to be captured
     * @param amount Amount of the authorization to be captured
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public SaleResponse captureSale(String paymentId, Integer amount) throws IOException, CieloRequestException {
        return captureSale(paymentId, amount, null);
    }

    /**
     * Capture a Sale on Cielo by paymentId
     *
     * @param paymentId The paymentId to be captured
     * @return The Sale with authorization, tid, etc. returned by Cielo.
     * @throws IOException
     * @throws CieloRequestException if anything gets wrong.
     * @see <a href=
     *      "https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error
     * Codes</a>
     */
    public SaleResponse captureSale(String paymentId) throws IOException, CieloRequestException {
        return captureSale(paymentId, null, null);
    }
}
