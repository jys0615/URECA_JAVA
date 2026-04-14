package ch11_exception;

public class BIDService { // id, pwd를 DB의 데이터와 비교하는라고 가정

	private String id = "myway";
	private String pwd = "gogogo";

	public void checkID( String id ) throws BIDException { // Exception 정보 전달
		if( ! this.id.equals(id) ) // id가 일치하지 않으면
			throw new BIDException("아이디가 올바르지 않습니다."); 
			// Exception 발생. checkID 메소드에서 예외가 발생하면, checkID 메소드를 호출한 곳으로 예외가 전달된다. (예외를 던진다.)
	}

	public void checkPWD( String pwd ) throws BIDException {
		if( ! this.pwd.equals(pwd) ) // pwd가 일치하지 않으면 
			throw new BIDException("패스워드가 올바르지 않습니다.");
	}

} // class
