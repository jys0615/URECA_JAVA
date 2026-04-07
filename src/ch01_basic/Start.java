package ch01_basic;

/*
 * class name 명명 규칙 (파스칼 표기법)
 * 첫문자 대문자, 이어지는 단어의 첫문자도 대문자, 나머지 소문자
 * 숫자 가능하나 맨 앞은 안됨
 * 특수문자는 _와 $만 가능 - 권장 안함
 * class name은 file name과 반드시 같아야 한다
 * 예) MethodName, MyFirstJavaProgramName
 * 주의) 키워드는 class name이나 method name으로 사용 안함 예) public은 이미 있음
 * 주의) 자바의 기존 class name과 충돌 주의 예) Integer는 이미 있음
 */

/*
 * method name (카멜 표기법)
 * 첫문자 소문자, 이어지는 단어의 첫문자 대문자, 나머지 소문자
 * 숫자 가능하나 맨 앞은 안됨
 * 예) myFirstVariable
 */

public class Start {
	/* 모든 소스 코드는 class 선언 {} 안에 작성
	 * 예외는 package, import 두 파일은 class () 밖에 작성
	 * package : 이 소스 파일의 컴파일된 ~.class 파일을 위치를 표시
	 * import : 현재 소스가 사용하는 다른 ~.class 파일의 위치를 표시
	 * import java.lang;은 생략된다 (java.lang은 기본 임포트)
	 */

	public static void main(String[] args) { // 프로그램의 시작점. 
		// 한줄 주석
		/*
		 * 여러줄 주석
		 * 좋은 소스 코드는 가독성 높은 소스 코드 - 들여쓰기와 주석을 활용
		 */
		/*
		 * 프로그램 시작 부분 : public static void main(String[] args) {}~
		 */
		System.out.println("Hello Java World~~~"); 
	} // main

} // class
