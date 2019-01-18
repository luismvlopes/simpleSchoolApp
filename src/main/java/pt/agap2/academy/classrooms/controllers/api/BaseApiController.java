package pt.agap2.academy.classrooms.controllers.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import pt.agap2.academy.classrooms.business.BusinessResult;
import pt.agap2.academy.classrooms.business.exceptions.BusinessException;
import pt.agap2.academy.classrooms.controllers.ApiUtils.ApiControllerHelper;

public class BaseApiController {

	public <T> ResponseEntity<ApiResult<T>> generateResponseEntityFromBusinessResult(BusinessResult<T> businessResult) {

		if(!businessResult.isSuccessful()) {
			generateResponseEntityWithError(businessResult.getException());
		}
		return generateSuccessfulResponseEntity(businessResult.getResult());
		
	}

	public <T> ResponseEntity<ApiResult<T>> generateSuccessfulResponseEntity(T payload) {
		return new ResponseEntity<>(new ApiResult<T>(payload), HttpStatus.OK);
	}

	public <T> ResponseEntity<ApiResult<T>> generateResponseEntityWithError(BusinessException bex) {
		
		if (bex == null) {
			System.out.println("NUll " + bex.getMessage());
			bex = new BusinessException();
		}
		
		ApiResult<T> result = new ApiResult<>();
		result.addError(bex.getMessage());
		HttpStatus httpStatus = ApiControllerHelper.generaeHttpStatusCodeFromErrorCode(bex.getErrorCode());
		
		return new ResponseEntity<>(result, httpStatus);
	}
}
