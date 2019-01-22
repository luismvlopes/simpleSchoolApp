package pt.agap2.academy.classrooms.business.exceptions;

public class ClassroomAlreadyExistsException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public ClassroomAlreadyExistsException() {
		super("Classroom Already Exists", BusinessErrorCode.CONFLICT);
	}
}
