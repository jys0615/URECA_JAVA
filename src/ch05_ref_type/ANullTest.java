package ch05_ref_type;

public class ANullTest {

	String memberStr;

	public static void main(String[] args) {

		ANullTest test = new ANullTest();
		System.out.println(test.memberStr);
		// 멤버 레퍼런스 타입 변수는 null로 자동 초기화 

		String localStr = null;
		// 지역 레퍼런스 타입 변수는 자동 초기화가 없음 
		// 반드시 초기화!!
		System.out.println(localStr);

		String s1 = new String("hi");
		s1 = null; // new String("hi"); // GC의 수집 대상이 됨

		String s2 = new String("hello");
		String s3 = s2; // pass by reference // pass by address
		System.out.printf("%s , %s\n", s2, s3);

		s2 = null;
		System.out.printf("%s , %s\n", s2, s3);

		System.out.println(s2.toString()); // NullPointerException
	} // main

}
// 메모리를 할당 받지 못한 것을 null이라고 한다. 
