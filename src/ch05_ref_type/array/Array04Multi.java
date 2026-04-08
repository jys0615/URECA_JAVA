package ch05_ref_type.array;

public class Array04Multi {

	public static void main(String[] args) {

		// 선언 방법.
		int [][] aArr; int[] bArr[]; int cArr [][];

		// 생성 방법.
		aArr = new int[3][4]; // 4층짜리에 동 3개.
		int [][] dArr = new int[3][4];
		int [][] eArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		aArr[0][0] = 555;
		aArr[1][1] = 444;
		aArr[2][2] = 333;
		System.out.println(aArr[0][0]);

		// 주의!!!
		int [][] fArr = new int [3][];
		//int [][] gArr = new int[][5]; // 오류. 2차원 배열은 1차원 배열의 크기를 먼저 지정해야 한다.
		fArr[0] = new int[4];
		fArr[1] = new int[5];
		fArr[2] = new int[6];
		System.out.println(fArr[0].length);
		System.out.println(fArr[1].length);
		System.out.println(fArr[2].length);

		// 2차원 배열은 2중 반복문과 사용.
		for(int i=0; i<fArr.length; i++) {
			for(int k=0; k<fArr[i].length; k++) {
				fArr[i][k] = (i+1) * (k+1);
			}
		} // for

		for(int i=0; i<fArr.length; i++) {
			for(int k=0; k<fArr[i].length; k++) {
				System.out.print("["+i+"]["+k+"] : ");
				System.out.println(fArr[i][k]);
			}
		} // for

	} // main

}
