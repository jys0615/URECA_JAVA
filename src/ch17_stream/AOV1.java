package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Stream : 배열이나 리스트를 읽어 들여서, 연산 처리가 가능한 새로운 Stream 객체를 만든다
 * - 자료의 처리가 쉽고 간단하다
 * - 배열이나 리스트를 읽어 들여서, 스트림을 생성하면 별도의 메모리 공간을 사용하므로, 기존 자료는 변하지 않음
 */
public class AOV1 { // overview

	public static void main(String[] args) {

		int [] intArr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum = sum + intArr[i];
		}
		System.out.println(sum);

		IntStream intStream = Arrays.stream(intArr);
		System.out.println( "sum : " + intStream.sum() );

//		System.out.println( intStream.count() ); // error
		// stream has already been operated upon or closed
		// 소모성, 일회성 - 한 번 생성하고 사용한 스트림은 재사용 안됨.

		System.out.println( Arrays.stream(intArr) );
		System.out.println( "sum : " + Arrays.stream(intArr).sum() );
		System.out.println( "count : " + Arrays.stream(intArr).count() );

		System.out.println( Arrays.toString(intArr) );
	} // main

}




