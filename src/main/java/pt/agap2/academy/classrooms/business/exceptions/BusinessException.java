package pt.agap2.academy.classrooms.business.exceptions;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private BusinessErrorCode errorCode = BusinessErrorCode.UNKNOWN;

	public BusinessException(Exception innerException) {
		super("Unnown Exception", innerException);
	}
	
	public BusinessException(String message, BusinessErrorCode errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public BusinessException() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public BusinessErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(BusinessErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
