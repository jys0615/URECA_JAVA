package ch05_ref_type.array;

public class Array07Multi {

	public static void main(String[] args) {

		int dArr [][] = {{1,2,3},{4,5,6,7,8,9}};
		System.out.println("dArr : "+ dArr.length); // 2차원 배열의 길이는 1차원 배열의 개수.
		System.out.println("dArr[0] : "+ dArr[0].length); // 2차원 배열의 0번 인덱스의 길이는 0번 인덱스의 1차원 배열의 개수.
		System.out.println("dArr[1] : "+ dArr[1].length); // 2차원 배열의 1번 인덱스의 길이는 1번 인덱스의 1차원 배열의 개수.

		for(int i=0; i<dArr.length; i++) {
			for(int k=0; k<dArr[i].length; k++) {
				System.out.print("dArr["+i+"]["+k+"] : ");
				System.out.println(dArr[i][k]);
			}//for
		}//for

	} // main

}
