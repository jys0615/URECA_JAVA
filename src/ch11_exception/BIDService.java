package ch11_exception;

public class BIDService { // id, pwd를 DB의 데이터와 비교하는 객체라고 가정

	private String id = "myway";
	private String pwd = "gogogo";

	public void checkID( String id ) throws BIDException { // Exception 정보 전달
		if( ! this.id.equals(id) )
			throw new BIDException("아이디가 올바르지 않습니다."); // Exception 발생
	}

	public void checkPWD( String pwd ) throws BIDException {
		if( ! this.pwd.equals(pwd) )
			throw new BIDException("패스워드가 올바르지 않습니다.");
	}

} // class
