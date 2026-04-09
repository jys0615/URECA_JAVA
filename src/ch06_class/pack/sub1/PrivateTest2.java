package ch06_class.pack.sub1;

public class PrivateTest2 {

	public static void main(String[] args) {

		PrivateTest test = new PrivateTest();
//		System.out.println(test.priVar); // error - priVar는 private
		// private 변수는 선언된 클래스 내부에서만 접근 가능

		System.out.println("test.defaultVar : " + test.defaultVar);
		System.out.println("test.proVar : " + test.proVar);

	}

}
