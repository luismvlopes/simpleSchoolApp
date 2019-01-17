package pt.agap2.academy.classrooms.business;

import pt.agap2.academy.classrooms.business.exceptions.BusinessException;

@FunctionalInterface
public interface ThrowingSuppl<T> {
	
	T get() throws BusinessException;

}
