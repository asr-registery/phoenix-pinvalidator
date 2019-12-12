/**
 * 
 */
package af.asr.pinvalidator.exception.pinvalidator.spi;

/**
 * Interface having a method to validate a pin
 */
public interface PinValidator<T> {

	/**
	 * Function to validate given pin
	 * 
	 * @param pin The pin to validate
	 * @return true if pin is valid
	 */
	boolean validatePin(T pin);
}
