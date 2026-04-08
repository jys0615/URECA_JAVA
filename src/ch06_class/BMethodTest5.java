package ch06_class;

public class BMethodTest5 {
	// 다 다르다고 인식한다.
	public void method() {}

	public void method(int k, int z) {}

	public void method(int i) {}
	
	public void method(String s) {}
//	public void method() {} // error - 일반적으로 동일한 메소드를 만들 수 없다

	/*
	 * Method Overloading
	 * 하나의 클래스에 동일한 이름을 갖는 메소드를 중복 선언
	 * JVM이 메소드를 판별할 때 <이름 + 파라미터>로 판별
	 * 파라미터 수가 다르거나, 선언된 데이터 타입이 다르면 다른 메소드로 인식
	 */
	public void sum(int a, int b) {}
//	public int sum(int x, int y) {} // error - 리턴 타입이 다르다고 다른 메소드로 인식 안함
	public void sum(int a, int b, int c) {}
	public void sum(double a, double b) {} // 타입이 다르므로 다른 메소드로 인식한다. 

} // class
