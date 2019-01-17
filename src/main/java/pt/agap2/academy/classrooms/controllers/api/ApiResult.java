package pt.agap2.academy.classrooms.controllers.api;

import java.util.ArrayList;
import java.util.List;

public class ApiResult<T> {

	private T data;
	private List<String> errors;
	private boolean successful;

	public ApiResult() {

	}

	public ApiResult(T data) {
		this.data = data;
		this.successful = true;
	}

	public ApiResult(List<String> errors) {
		this.errors = errors;
		this.successful = false;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
		this.successful = true;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
		this.successful = false;
	}

	public void addError(String message) {
		if (this.errors == null) {
			this.errors = new ArrayList<>();
		}
		this.errors.add(message);
		this.successful = false;
	}

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

}
