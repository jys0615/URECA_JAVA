package ch17_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HFlatMappingExample {
	public static void main(String[] args) {
		//문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
//		list1.stream()
//			.flatMap(data -> Arrays.stream(data.split(" ")))
//			.forEach(word -> System.out.println(word));
		Stream<String> strStream
			= list1.stream()
					.flatMap(data -> Arrays.stream(data.split(" ")));
		strStream.forEach(word -> System.out.println(word));
		
		System.out.println();

		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30"
											, "40, 50"); // 2개의 문자열.

		list2.stream()
			.flatMapToInt(data -> { // data - 2개의 문자열.
				String[] strArr = data.split(","); // 문자열을 기준(,)으로 잘라서 문자 배열로 만듬.
				int[] intArr = new int[strArr.length]; // 문자 배열의 크기와 같은 숫자 배열 만듬.
				for (int i = 0; i < strArr.length; i++) { // 문자 배열의 크기만큼 반복.
					int tmpInt = Integer.parseInt(strArr[i].trim()); // 문자를 숫자로 변환.
					intArr[i] = tmpInt; // 변환한 숫자를 숫자 배열에 담음.
				} // for
				return Arrays.stream(intArr); // 숫자 배열을 스트림으로 리턴.
			}) // end of flatMapToInt
			.forEach(number -> System.out.println(number)); // 숫자 스트림 출력.

		System.out.println();
		String[] strArr1 = list2.get(0).split(","); // "10, 20, 30"
		String[] strArr2 = list2.get(1).split(","); // "40, 50"
		String[] strArr3 = new String [strArr1.length + strArr2.length];
		System.arraycopy(strArr1, 0, strArr3, 0, strArr1.length);
		System.arraycopy(strArr2, 0, strArr3, strArr1.length, strArr2.length);
		System.out.println( "strArr1 : " + Arrays.toString(strArr1) );
		System.out.println( "strArr2 : " + Arrays.toString(strArr2) );
		System.out.println( "strArr3 : " + Arrays.toString(strArr3) );
		int [] intArr = new int[strArr3.length];
		for (int i = 0; i < strArr3.length; i++) {
			intArr[i] = Integer.parseInt( strArr3[i].trim() );
		} // for
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(number -> System.out.println(number));
	} // main

}
