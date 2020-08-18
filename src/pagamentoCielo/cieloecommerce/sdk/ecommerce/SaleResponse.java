package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gustavo.kruger
 */
public class SaleResponse {

	@SerializedName("MerchantOrderId")
	private String merchantOrderId;
	
    @SerializedName("Status")
    private String status;

    @SerializedName("ReasonCode")
    private String reasonCode;

    @SerializedName("ReasonMessage")
    private String reasonMessage;

    @SerializedName("ProviderReturnCode")
    private String providerReturnCode;

    @SerializedName("ProviderReturnMessage")
    private String providerReturnMessage;

    @SerializedName("ReturnCode")
    private String returnCode;

    @SerializedName("ReturnMessage")
    private String returnMessage;

    @SerializedName("AuthenticationUrl")
    private String authenticationUrl;
    
    @SerializedName("Links")
    private Links[] links;

    public SaleResponse() {
    }

    public SaleResponse(String status, String reasonCode, String reasonMessage, String providerReturnCode, String providerReturnMessage, String returnCode, String returnMessage, Links[] links) {
        this.status = status;
        this.reasonCode = reasonCode;
        this.reasonMessage = reasonMessage;
        this.providerReturnCode = providerReturnCode;
        this.providerReturnMessage = providerReturnMessage;
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.links = links;
    }

    public String getStatus() {
        return status;
    }

    public String getMerchantOrderId() {
		return merchantOrderId;
	}

	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public void setStatus(String status) {
        this.status = status;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonMessage() {
        return reasonMessage;
    }

    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }

    public String getProviderReturnCode() {
        return providerReturnCode;
    }

    public void setProviderReturnCode(String providerReturnCode) {
        this.providerReturnCode = providerReturnCode;
    }

    public String getProviderReturnMessage() {
        return providerReturnMessage;
    }

    public void setProviderReturnMessage(String providerReturnMessage) {
        this.providerReturnMessage = providerReturnMessage;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	public void setAuthenticationUrl(String authenticationUrl) {
		this.authenticationUrl = authenticationUrl;
	}

	public Links[] getLinks() {
        return links;
    }

    public void setLinks(Links[] links) {
        this.links = links;
    }
}