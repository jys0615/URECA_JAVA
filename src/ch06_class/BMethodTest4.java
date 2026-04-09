package ch06_class;

public class BMethodTest4 {

	public static void main(String[] args) {

		// BMethodTest4가 BMethodTest3를 사용하는 관계
		BMethodTest3 test = new BMethodTest3();
		System.out.println(test.statusFlag);

		test.sum1(123, 456);
		System.out.println(test.statusFlag);

		test.statusFlag = "call by test4";
		System.out.println(test.statusFlag);

		int c = test.sum2(321, 654);
		System.out.println(c);
		// 다른 객체의 메소드 실행을 통해 다른 객체와 데이터를 주고 받을 수 있다
	} // main

}
