package ch06_class.pack.sub2;

import ch06_class.pack.sub1.PrivateTest;

public class DefaultTest {

	public static void main(String[] args) {

		PrivateTest test = new PrivateTest();
//		System.out.println(test.defaultVar); // error
		// default 변수는 선언된 패키지 내부에서만 접근 가능

//		System.out.println("test.proVar : " + test.proVar); // error
		// protected 변수는 선언된 패키지 내부 + 자식 클래스에서만 접근 가능

		ProtectedTest2 test2 = new ProtectedTest2();
//		System.out.println("test2.proVar" + test2.proVar); // error
		// protected 변수는 선언된 패키지 내부 + 자식 클래스에서만 접근 가능

		System.out.println("test.publicVar : " + test.publicVar);
		// public : 접근 제한 없음

	}

}
