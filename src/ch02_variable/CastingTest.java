package ch02_variable;

/*
 * Data Type Casting
 * Promotion : 자동/묵시적 형태 변환 : 작은 데이터 -> 큰 데이터 타입 (메모리 크기 기준)
 * Demotion : 강제/명시적 형태 변환 : 큰 데이터 -> 작은 데이터 타입. 버려지는 비트들이 있기 때문에 명시적으로 형변환을 해야 한다. 
 */
public class CastingTest {

	public static void main(String[] args) {
		byte byteVar = 127; // byte -128 ~ 127
		int intVar = byteVar; // 묵시적
		System.out.println("intVar : " + intVar);

		int intVar2 = 127;
		byte byteVar2 = (byte) intVar2; // 명시적. 24비트 정도 버려지니까 소괄호를 써서 데이터 타입을 지정해 준다. 
		System.out.println("byteVar2 : " + byteVar2);

		int intVar3 = 999999999;
		double doubleVar = intVar3;
		System.out.println("doubleVar : " + doubleVar);

		double doubleVar2 = 9.123456789;
		int intVar4 = (int) doubleVar2;
		System.out.println("intVar4 : " + intVar4);

		int intVar5 = 128;
//		intVar5 = 129;
//		intVar5 = 130;
		byte byteVar3 = (byte) intVar5; // 명시적 형변환은 Data 손실 가능성 생김
		System.out.println("byteVar3 : " + byteVar3);

		char chVar = 'Z';
		int intVar6 = chVar;
		System.out.println("(char) 122 : " + (char) 122);

		// 정수의 사칙 연산 결과는 int가 된다.
		byte byteVar4 = 7, byteVar5 = 8;
		byte byteVar6 = (byte) (byteVar4 + byteVar5);
		int intVar7 = byteVar4 + byteVar5;
		System.out.println("intVar7 : " + intVar7);

		// long 변수 선언시, L 또는 l 이 없으면 int
		long longVar = 123L, longVar2 = 456l;
		//long longVar3 = 10000000000; // error - int 인식
		long longVar4 = 10000000000L; // long 인식

		// float 변수 선언시, F 또는 f 가 없으면 double
		float floatVar = 0.123F, floatVar2 = 0.456f;
	} // main

} // class
