package ch02_variable;

//멤버 변수 : 클래스 내부에 선언되는 변수
//지역 변수 : 메소드 내부에 선언되는 변수
public class VarInitTest {

	// 멤버 변수 자동 초기화 (객체 생성 시 자동 값 대입)
	static int memVar; // 정수는 0으로 자동 초기화
	static double doVar; // 실수는 0.0으로 자동 초기화
	static boolean booVar; // 논리형은 false으로 자동 초기화
	static char chVar; // 문자형은 공백으로 자동 초기화

	public static void main(String[] args) {
		System.out.println(memVar);
		System.out.println(doVar);
		System.out.println(booVar);
		System.out.println(chVar);

		// 지역 변수 자동 초기화 없음 -> 값 대입 후 사용해야 함!!!
		int localVar;
		localVar = 777;
		System.out.println(localVar);

	} // main

} // class
