package pagamentoCielo.cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class DebitCard {
	
	@SerializedName("CardNumber")
	private String cardNumber;

	@SerializedName("Holder")
	private String holder;

	@SerializedName("ExpirationDate")
	private String expirationDate;

	@SerializedName("SecurityCode")
	private String securityCode;
	
	@SerializedName("Brand")
	private String brand;

	public DebitCard(String securityCode, String brand) {
		setSecurityCode(securityCode);
		setBrand(brand);
	}

	public String getBrand() {
		return brand;
	}

	public DebitCard setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public DebitCard setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public DebitCard setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public String getHolder() {
		return holder;
	}

	public DebitCard setHolder(String holder) {
		this.holder = holder;
		return this;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public DebitCard setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
		return this;
	}
}
