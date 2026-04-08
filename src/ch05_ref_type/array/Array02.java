package ch05_ref_type.array;

public class Array02 {

	// 배열의 선언, 생성, 초기값 대입(data input).
	public static void main(String[] args) {

		int [] intArr; // 배열의 선언.
		int intArr2 []; // [] : 배열 표시.

		intArr = new int[3]; // 생성 - [3] : 배열의 길이 선언.
		// intArr2 = new int[]; // error : 길이는 반드시 선언.

		intArr[0] = 777; // 초기값 대입(data input)

		System.out.println(intArr[0]);
		System.out.println(intArr[1]); // 값을 안넣으면 0으로 기본 설정됨.

		int [] intArr3 = new int[5]; // 선언과 생성을 한번에.

		int [] intArr4 = {5,6,7,8,9}; // 선언, 생성, 대입을 한번에.
		System.out.println(intArr4[2]);

		int [] intArr5; // 선언을 하는 부분에서 중괄호를 해야 한다. 선언과 동시에 초기값 대입이 되어야 한다.
		// intArr5 = {11,12,13};//error : 선언과 동시에 초기값 대입이 되어야 한다. 선언과 생성을 한번에 해야 한다.

	} // main

}
