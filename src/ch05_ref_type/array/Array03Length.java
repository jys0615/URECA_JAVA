package ch05_ref_type.array;

public class Array03Length {

	public static void main(String[] args) {

		int [] iArr = new int[3];
		System.out.println("length : " + iArr.length);//길이 확인.

		// 배열은 반복문과 함께.
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = 3 * i;
		}//for

		for(int k=0; k<iArr.length; k++) {
			System.out.println(iArr[k]);
		}//for

		// array는 resize가 불가.
		// resize 필요시, 새로 생성 후 복사. -> arraycopy 함수
		int [] iArr2 = {1,2,3,4,5};
		System.arraycopy(iArr, 1, iArr2, 1, 2);

		for(int k=0; k<iArr2.length; k++) {
			System.out.print(iArr2[k]+"\t");
		}//for

	} // main

}
