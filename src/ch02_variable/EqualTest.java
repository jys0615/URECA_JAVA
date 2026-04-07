package ch02_variable;

public class EqualTest {

	public static void main(String[] args) {
		// primitive data type
		int a = 7, b = 7;
		System.out.println("int 내용 비교 : " + (a == b)); // true - 내용 비교

		// object data type
		String s1 = new String("hi");
		String s2 = new String("hi");
		System.out.println(s1 == s2); // false - 위치값 비교
		System.out.println("String 내용 비교 : " + s1.equals(s2)); // true - 내용 비교

		String s3 = new String("HI");
		System.out.println("String 내용 비교 2 : " + s1.equals(s3)); // false - 내용 비교
		System.out.println("String 내용 비교 3 : " + s1.equalsIgnoreCase(s3)); // true - 내용 비교. 대소문자 구분을 안하면서 비교.

		String s4 = "hello", s5 = "hello"; // s4가 상수풀에 등록되고, s5는 재사용
		System.out.println(s4 == s5); // true - new 없으면, 상수 Pool 사용 (한 번 만들어진 문자열 재사용). 똑같은 값이 들어왔을 때 다시 재사용을 한다.

	} // main

} // class
