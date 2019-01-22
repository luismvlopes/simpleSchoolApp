package pt.agap2.academy.classrooms.business;

import pt.agap2.academy.classrooms.business.exceptions.BusinessException;

public class BaseService {

	public <T> BusinessResult<T> executeOperation(ThrowingSuppl<T> operations) {

		try {
			T data = operations.get();
			return new BusinessResult<>(data);

		} catch (BusinessException ex) {
			ex.printStackTrace();
			return new BusinessResult<>(ex);

		} catch (Exception e) {
			return new BusinessResult<>(new BusinessException(e));
		}

	}
}
