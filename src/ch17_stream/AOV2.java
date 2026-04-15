package ch17_stream;

import java.util.Arrays;

/*
 * 스트림의 연산은 중간 연산과 최종 연산으로 구분
 * - 중간 연산은 여러개 적용 가능
 * - 최종 연산은 마지막에 한번만 적용 가능
 * - 최종 연산이 적용 되어야 중간 연산의 결과도 적용됨
 * - filter : 중간, data를 특정 기준으로 분류
 * - map : 중간, data 변환
 * - sorted : 최종, 정렬
 * - forEach : 최종, 반복
 * - count : 최종, 갯수
 * - sum : 최종, 합계
 */
public class AOV2 {

	public static void main(String[] args) {

		int [] intArr = {4,5,6,1,2,3,9,10,7,8};

		System.out.println( "sum : " + Arrays.stream(intArr).sum() );
		System.out.println( "count : " + Arrays.stream(intArr).count() );

		System.out.print("forEach : ");
		Arrays.stream(intArr).forEach(var->System.out.print(var + ",\t"));
		// forEach : 반복, var : 변수 (스트림 내부의 요소를 나타냄)
		System.out.println("\n");

		System.out.print("sorted forEach : ");
		Arrays.stream(intArr).sorted().forEach(var->System.out.print(var + ",\t"));
		System.out.println("\n");

		System.out.print("filter forEach : ");
		Arrays.stream(intArr).filter(n->n>5).forEach(n->System.out.print(n + ",\t"));
		System.out.println("\n");

		System.out.print("filter forEach : ");
		Arrays.stream(intArr).filter(n->n>3&&n<7).forEach(n->System.out.print(n + ",\t"));
		System.out.println("\n");

		System.out.print("filter forEach : ");
		Arrays.stream(intArr).filter(n->n>5).filter(n->n==7).forEach(n->System.out.print(n + ",\t"));
		System.out.println("\n");

	} // main

}
