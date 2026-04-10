package ch11_exception;

// User Defined Exception : 개발자가 편의를 위해 만들어 사용하는 예외 객체
public class BIDException extends Exception {

	public BIDException() {}

	public BIDException(String message) {
		super(message);
	}

}
