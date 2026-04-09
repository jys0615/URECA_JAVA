package ch06_class;

public class BMethodTest2 {

	public static void main(String[] args) {

		BMethodTest2 test = new BMethodTest2();
		test.method1(); // 다른 메소드 실행, main : caller, method1 : worker
		System.out.println("main");
	}

	public void method1() {
		System.out.println("method1 start");
		method2(); // 다른 메소드 실행, method1 : caller, method2 : worker
		System.out.println("method1 end");
	} // method1

	public void method2() {
		System.out.println("method2");
	} // method2

}
