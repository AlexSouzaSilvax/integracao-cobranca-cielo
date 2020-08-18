package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class CardToken {
	@SerializedName("Brand")
	private String brand;

	@SerializedName("CardNumber")
	private String cardNumber;

	@SerializedName("CardToken")
	private String cardToken;

	@SerializedName("CustomerName")
	private String customerName;

	@SerializedName("ExpirationDate")
	private String expirationDate;

	@SerializedName("Holder")
	private String holder;

	@SerializedName("Links")
	private Object links;

	public String getBrand() {
		return brand;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCardToken() {
		return cardToken;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public String getHolder() {
		return holder;
	}

	public Object getLinks() {
		return links;
	}

	public CardToken setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public CardToken setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	public CardToken setCustomerName(String customerName) {
		this.customerName = customerName;
		return this;
	}

	public CardToken setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public CardToken setHolder(String holder) {
		this.holder = holder;
		
		if (customerName == null) {
			setCustomerName(holder);
		}
		return this;
	}
}
