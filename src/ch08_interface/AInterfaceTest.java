package ch08_interface;

interface Inter1 {
	int var1 = 7; // 변수를 선언하면 무조건 상수가 됨, public final static이 자동으로 삽입됨
//	void method1() {} // error - 일반 메소드는 안됨
	void method2(); // 메소드를 선언하면 자동으로 public abstract가 삽입됨
	default void method3() {} // default 키워드가 있는 일반 public method 가능
	static void method4() {} // public static method 가능
	private void method5() {} // 내부용 private method 가능
	private static void method6() {} // 내부용 private static method 가능
}

public class AInterfaceTest {

	public static void main(String[] args) {
//		Inter1 i  = new Inter1(); // error - 인터페이스는 객체 생성 불가
//		Inter1.method3(); // error
		Inter1.method4();
	}

}
