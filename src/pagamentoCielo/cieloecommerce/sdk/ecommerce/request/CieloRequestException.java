package pagamentoCielo.cieloecommerce.sdk.ecommerce.request;

/**
 * Just an exception that can be catch by the app
 */
public class CieloRequestException extends Exception {
	private static final long serialVersionUID = -7910571382354848575L;
	private final CieloError error;

	public CieloRequestException(String message, CieloError error, Throwable cause) {
		super(message, cause);

		this.error = error;
	}

	/**
	 * The error related with this exception
	 *
	 * @return The {@link CieloError} with the error codes and message.
	 */
	public CieloError getError() {
		return error;
	}
}
