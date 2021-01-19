package co.hospital.exception;

public class HospitalException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1805991863374982173L;

	public HospitalException() {
		super();
	}

	public HospitalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HospitalException(String message, Throwable cause) {
		super(message, cause);
	}

	public HospitalException(String message) {
		super(message);
	}

	public HospitalException(Throwable cause) {
		super(cause);
	}

}
