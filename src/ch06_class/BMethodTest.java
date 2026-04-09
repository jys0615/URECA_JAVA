package ch06_class;

public class BMethodTest {

	public static void main(String[] args) {
//		method1(); // static 아니어서(메모리에 로딩 안되서) 호출 안됨
		method2();

		BMethodTest test = new BMethodTest();
		test.method1(); //  메모리에 올라간 test 내부의 method1 접근

	} // main

	public void method1() {
		System.out.println("method1");
	}

	public static void method2() {
		System.out.println("method2");
	}

} // class
