package pt.agap2.academy.classrooms.business;

import pt.agap2.academy.classrooms.business.exceptions.BusinessException;

public class BusinessResult<T> {
	
	private T result;
	private BusinessException exception;
	private Boolean successful;
	
	public BusinessResult() {
	}
	
	public BusinessResult(T result) {
		this.result = result;
		this.successful = true;
	}
	
	public BusinessResult(BusinessException exception) {
		this.exception = exception;
		this.successful = false;
	}
	

	public BusinessResult(T result, BusinessException exception, Boolean successful) {
		this.result = result;
		this.exception = exception;
		this.successful = successful;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public BusinessException getException() {
		return exception;
	}

	public void setException(BusinessException exception) {
		this.exception = exception;
	}

	public Boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	
}
