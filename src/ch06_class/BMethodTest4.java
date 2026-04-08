package ch06_class;

public class BMethodTest4 {

	public static void main(String[] args) {

		// BMethodTest4가 BMethodTest3를 사용하는 관계
		BMethodTest3 test = new BMethodTest3();
		System.out.println(test.statusFlag); // null - 객체가 만들어질 때 필드의 초기값이 자동으로 들어간다. String의 초기값은 null이다.

		test.sum1(123, 456);
		System.out.println(test.statusFlag); // sum1 - sum1 메소드가 실행되면서 statusFlag의 값이 sum1으로 바뀌었다. 객체의 필드값이 바뀌는 것을 볼 수 있다.

		test.statusFlag = "call by test4";
		System.out.println(test.statusFlag);

		int c = test.sum2(321, 654);
		System.out.println(c);
		// 다른 객체의 메소드 실행을 통해 다른 객체와 데이터를 주고 받을 수 있다
	} // main

} // class

// 객체와 객체는 서로 소통을 할 수 있다. 
// 객체와 객체가 소통을 하는 방법은 메소드를 통해서이다. 