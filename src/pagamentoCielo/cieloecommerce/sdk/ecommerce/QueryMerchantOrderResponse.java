package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gustavo.kruger
 */
public class QueryMerchantOrderResponse {

	@SerializedName("Payments")
    private Payment[] payments;

    public QueryMerchantOrderResponse() {
    }

	public Payment[] getPayments() {
		return payments;
	}

	public void setPayment(Payment[] payments) {
		this.payments = payments;
	}

    
}