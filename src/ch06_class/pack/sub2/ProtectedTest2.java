package ch06_class.pack.sub2;

import ch06_class.pack.sub1.ProtectedTest;

public class ProtectedTest2 extends ProtectedTest {

	public static void main(String[] args) {

		ProtectedTest2 test = new ProtectedTest2();
		System.out.println("test.proVar" + test.proVar);
		// protected 변수는 선언된 패키지 내부 + 자식 클래스에서만 접근 가능

	}

}
