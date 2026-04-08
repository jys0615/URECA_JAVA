package ch05_ref_type.array;

public class Array06Multi {

	public static void main(String[] args) {

		int [][] aArr;
		int []bArr[];
		int cArr [][]; // 선언

		aArr = new int [2][3];

		bArr = new int[2][]; // 뒤만 미정 가능.
		bArr[0] = new int[3];
		bArr[1] = new int[5];

		int dArr [][] = {{1,2,3},{4,5,6,7,8,9}};

		// {}표현은 선언, 생성, 대입이 한번에 이루어져야 함.
		// cArr = {{1,2,3},{4,5,6,7,8,9}};//error

		aArr[0][1] = 7;
		aArr[1][2] = 8;
		System.out.println(aArr[1][2]);

	} // main

}
