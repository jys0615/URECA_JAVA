package ch06_class;

public class ISingleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기
	private static ISingleton singleton = new ISingleton();

	//private 접근 권한을 갖는 생성자 선언
	private ISingleton() {
	}

	//public 접근 권한을 갖는 정적 메소드 선언 
	static ISingleton getInstance() {
		return singleton;
	}
}
