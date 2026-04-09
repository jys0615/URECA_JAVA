package ch06_class;

/*
 * 상수 선언 : 전부 대문자 + 단어가 이어질 때 _ 사용
 * final : 최종을 선언하는 키워드 : 상수, 오버라이드 불가 메소드, 상속 불가 클래스를 만들 때 사용
 * final 변수 : 상수 : 선언과 동시에 값을 대입
 */
public class GFinalTest {

	static final int FINAL_VAR = 77;

	public static void main(String[] args) {

//		FINAL_VAR = 88; // error
	}

}
