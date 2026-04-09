package ch06_class;

/*
 * Constructor
 * 객체를 생성할 때 실행 (객채 생성 순서는 1.변수, 2.생성, 3.대입, 4.생성자실행)
 * 리턴타입이 없는 특수한 메소드
 * Constructor 이름은 클래스명과 같다
 * 생성할 때 값을 전달하거나, 멤버 변수를 초기화할 때 사용
 * 생성자를 코딩하지 않으면 기본 생성자를 JVM이 추가
 * default Constructor : public 클래스명() {} // 내용 없는 ()와 {}로 구성
 * 생성자를 코딩하면 JVM이 기본 생성자를 추가하지 않음
 * 생성자도 특수한 메소드이므로 <메소드 오버로딩>이 적용됨
 */
public class CConstructorTest {

	int i = 7;
	// i의 생성 과정 : 최초 기본값 <0> -> 초기화값 <7> -> 생성자 실행값 <999>
	String str = "최초 입력";
	// str의 생성 과정 : 최초 기본값 <null> -> 초기화값 <최초 입력> -> 생성자 실행값 <생성자 입력>

	public CConstructorTest() {
		i = 999;
		str = "생성자 입력";
	}

	// 생성할 때 외부로부터 데이터를 가져오는 역할
	public CConstructorTest(int iVar, String sVar) {
		i = iVar;
		str = sVar;
	}

	public CConstructorTest(String sVar, int iVar) {} // 오버로딩 예

	public static void main(String[] args) {

		CConstructorTest test = new CConstructorTest();
		System.out.println(test.str);

		CConstructorTest test2 = new CConstructorTest(123, "외부로부터 데이터를 가져옴");
		System.out.println(test2.str);

	} // main

}
