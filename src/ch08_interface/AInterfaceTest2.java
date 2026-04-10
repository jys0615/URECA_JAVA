package ch08_interface;

interface Inter2 {
	int INT_VAR = 77;
	default void defaultMethod() {
		System.out.println(INT_VAR);
	}
}
interface Inter3 {}
interface Inter4 {}
interface Inter5 {}
interface Inter6 extends Inter2, Inter3, Inter4, Inter5 {}

class InterClass1 implements Inter2 {}
class InterClass2 implements Inter2, Inter3, Inter4 {}

// implements : 인터페이스를 상속하는 키워드, 상속과 다형성 개념을 구현.
public class AInterfaceTest2 {
	public static void main(String[] args) {

		// 인터페이스를 이용해 다형성의 이점을 얻을 수 있다.
		Inter2 i1 = new InterClass1();
		Inter2 i2 = new InterClass1();

		System.out.println(i1.INT_VAR);
		i1.defaultMethod();

	} // main
}
