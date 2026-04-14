package ch16_Lambda;

/*
 * 람다식 : lambda expression
 * - 자바에서 함수형 프로그래밍(functional programming)을 구현하는 방식
 * - 자바8부터 지원
 * - 클래스를 생성하지 않아도 함수의 호출만으로 기능을 수행
 */
/*
 * 람다식 구현 : 익명 함수 만들기
 * - 매개변수(parameters/arugments)와 매개변수를 사용하는 실행문으로 구성
 * - 반드시 @FunctionalInterface 선언해야 함
 * - 반드시 메소드는 1개만 존재해야 함
 */
@FunctionalInterface // 1. @FunctionalInterface 선언
interface SimpleLambda {
	public int add(int x, int y); // 2. 추상 메소드 선언
//	public int minus(int x, int y); // error // 반드시 메소드는 1개만 존재해야 함
}

public class AOverView {

	public static void main(String[] args) {

		SimpleLambda func = (x,y)->{return x+y;};
		// 3. 추상 메소드를 구현한 코드 작성 (상속 클래스 없이, 함수만 구현)
		// 4. 함수를 변수에 대입

		System.out.println( func.add(333, 444) ); // 5. 변수를 통해 함수 사용

		SimpleLambda func2 = (x,y)->{return x*y;};
		System.out.println( func2.add(3, 4) );

	} // main

} // class
