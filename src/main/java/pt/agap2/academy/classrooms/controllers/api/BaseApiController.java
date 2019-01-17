package pt.agap2.academy.classrooms.controllers.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import pt.agap2.academy.classrooms.business.BusinessResult;

public class BaseApiController {

	public <T> ResponseEntity<ApiResult<T>> generateResponseEntityFromBusinessResult(BusinessResult<T> businessResult) {

		return generateSuccessfulResponseEntity(businessResult.getResult());
		
	}

	public <T> ResponseEntity<ApiResult<T>> generateSuccessfulResponseEntity(T payload, HttpStatus httpStatus) {
		return new ResponseEntity<>(new ApiResult<T>(payload), httpStatus);
	}

}
