package ch11_exception;

// User Defined Exception : 개발자가 편의를 위해 만들어 사용하는 예외 객체
public class BIDException extends Exception { // Exception을 상속 받으면 Exception이 된다. (Exception은 Throwable의 자식 클래스)

	public BIDException() {}

	public BIDException(String message) {
		super(message);
	}

}
