package ch05_ref_type.array;

/*
 * Array: 하나의 변수로 여러 데이터를 handling.
 * length : 길이개념, index:번지개념.
 * same data type, group handling, java object.
 * new를 통해 객체 생성하는 자바 instance.
 * 하나의 변수명 + 번지를 통해 접근.
 */
public class Array01 {

	public static void main(String[] args) {

		int a = 7, b = 8, c = 9; // primitive type, 변수명은 a,b,c.
		String s = new String("hi"); // s도 변수인데 스트링이라는 객체 타입의 변수이다. s가 잡히는 건 맞는데 s가 가리키는 것은 주소. 스트링 객체를 하나 만드는 것이다. new는 메모리를 할당하는 명령어다. 
		// 변수가 많으면 관리가 어렵더라.

		int [] intArr; // int의 집합의 변수. int의 배열 타입이다.
		intArr = new int [3]; // 길이 개념은 3. 실제로 배열을 만드는 것이다. 3층짜리 빌라를 하나 짓는다. 
		intArr[0] = 7; // 번지 개념은 0에서 시작.
		intArr[1] = 8; // 1층은 8이 살고 있다. 
		intArr[2] = 9; // 마지막 번지는 길이 - 1.

		System.out.println(intArr[0]);

	} // main

}
