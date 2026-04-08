package ch05_ref_type.array;

// same data
// group handling : 하나의 변수
// java object : new
public class Array05Re {

	public static void main(String[] args) {

		int [] aArr; // 선언 방법
		int bArr []; // 선언 방법

		aArr = new int[3]; // 생성 방법

		aArr[0] = 1; // 최초 대입 방법
		aArr[1] = 2;
		aArr[2] = 3;

		int cArr [] = {3,2,1}; // 선언,생성,대입 한 번에

		//bArr = {5,6,7}; // error

		bArr = new int[3];
		System.out.println(bArr[1]); // 최초 기본값 설정됨.

		for(int i=0; i<aArr.length; i++) {
			System.out.println("aArr["+i+"] : "+ aArr[i]);
		} // for

	} // main

}
