/*
 * 
 * 
 */
package af.asr.pinvalidator.exception.pinvalidator.exception;

import af.asr.pinvalidator.exception.common.BaseUncheckedException;
/**
 * {@link Exception} to be thrown when Pin is invalid
 */
public class InvalidPinException extends BaseUncheckedException {

	/**
	 * Unique id for serialization
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for this class
	 * 
	 * @param errorCode    exception code
	 * @param errorMessage exception message
	 */
	public InvalidPinException(String errorCode, String errorMessage) {

		super(errorCode, errorMessage);

	}
}
