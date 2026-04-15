package ch17_stream;

import java.util.Arrays;

public class AOV5 {

	public static void main(String[] args) {

		int [] intArr = {1,2,3,4,5,6,7,8,9,10};
		// reduce() : 정의된 연산이 아닌, 프로그래머가 직접 지정하는 연산을 적용
		//reduce(초기값or시작값, 계산식)
		System.out.println("1 : " + Arrays.stream(intArr).reduce(0, (a,b)->a+b) ); // int sum = 0;
		System.out.println("2 : " + Arrays.stream(intArr).reduce(7, (a,b)->a+b) ); // int sum = 7;
		System.out.println("3 : " + Arrays.stream(intArr).reduce(0, (a,b)->a-b) );
		System.out.println( "sum : " + Arrays.stream(intArr).sum() );
		System.out.println( "count : " + Arrays.stream(intArr).count() );

		String [] strArr = {"hi", "hello", "how are you", "i am fine", "thank you"};
		String str = Arrays.stream(strArr)
							.reduce(""
								, (s1, s2)->{
												if (s1.getBytes().length >= s2.getBytes().length )
													return s1;
												else return s2;
											}
								); // reduce
		System.out.println("가장 긴 문장 : " + str);

	} // main

}
