package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class RecurrentSale {
    @SerializedName("Customer")
    private Customer customer;

    @SerializedName("RecurrentPayment")
    private RecurrentPayment recurrentPayment;

    public Customer getCustomer() {
        return customer;
    }

    public RecurrentSale setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public RecurrentPayment getRecurrentPayment() {
        return recurrentPayment;
    }

    public RecurrentSale setRecurrentPayment(RecurrentPayment recurrentPayment) {
        this.recurrentPayment = recurrentPayment;
        return this;
    }
}
