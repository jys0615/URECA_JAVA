package ch05_ref_type.array;

public class Array08GuGu {

	public static void main(String[] args) {

		int [][] gugu = new int[9][9];

		// 1. for문을 사용하여, 구구단을 채워라.
		for(int i=0, dan=1; i<gugu.length; i++, dan++) {
			for(int k=0, gop=1; k<gugu[i].length; k++, gop++) {
				gugu[i][k] = dan * gop;
			}
		} // for

		// 2. for문을 사용하여, 배열 내용 출력.
		for(int i=0; i<gugu.length; i++) {
			for(int k=0; k<gugu[i].length; k++) {
				System.out.print("gugu["+i+"]["+k+"] : "); // +i+ => 0,1,2,3,4,5,6,7,8
				System.out.println(gugu[i][k]);
			}
		} // for

	} // main

}
