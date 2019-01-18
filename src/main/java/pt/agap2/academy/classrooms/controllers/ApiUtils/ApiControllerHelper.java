package pt.agap2.academy.classrooms.controllers.ApiUtils;

import org.springframework.http.HttpStatus;

import pt.agap2.academy.classrooms.business.exceptions.BusinessErrorCode;

public class ApiControllerHelper {

	public static HttpStatus generaeHttpStatusCodeFromErrorCode(BusinessErrorCode businessExceptionCode) {

		HttpStatus httpStatus;

		switch (businessExceptionCode) {
		case BAD_REQUEST:
			httpStatus = HttpStatus.BAD_REQUEST;
			break;
		case INTERNAL_SERVER_ERROR:
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			break;
		case NOT_FOUND:
			httpStatus = HttpStatus.NOT_FOUND;
			break;
		case CONFLICT:
			httpStatus = HttpStatus.CONFLICT;
			break;
		case UNAUTHENTICATED:
			httpStatus = HttpStatus.UNAUTHORIZED;
			break;
		case UNKNOWN:
		default:
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			break;
		}

		return httpStatus;
	}

}
