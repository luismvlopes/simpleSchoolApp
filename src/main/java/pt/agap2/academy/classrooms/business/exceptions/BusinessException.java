package pt.agap2.academy.classrooms.business.exceptions;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private BusinessErrorCode errorCode = BusinessErrorCode.UNKNOWN;

	public BusinessErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(BusinessErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
