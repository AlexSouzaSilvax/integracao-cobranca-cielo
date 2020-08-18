package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class RecurrentTransaction {
    @SerializedName("PaymentId")
    private String paymentId;

    @SerializedName("PaymentNumber")
    private Integer paymentNumber;

    @SerializedName("TryNumber")
    private Integer tryNumber;

    public String getPaymentId() {
        return paymentId;
    }

    public Integer getPaymentNumber() {
        return paymentNumber;
    }

    public Integer getTryNumber() {
        return tryNumber;
    }
}
