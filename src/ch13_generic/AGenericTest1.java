package ch13_generic;

import java.util.ArrayList;

/*
 * Generic : 클래스 내부에서 사용할 data type을 선언할 때 지정하는 기법
 *  - 다이아몬드 지시자로 클래스 내부에서 사용할 data type을 지정
 *  - 장점 : 클래스 내부에서 사용하는 data type을 명확히 알 수 있다
 *  - 장점 : 형변환이 필요 없어 코드를 줄일 수 있다
 *  - 장점 : 형변환에서 발생하는 실수를 줄일 수 있다
 *  
 *  변수의 선언이나 메서드의 매개변수를 하나의 참조형이 아닌 여러 자료형으로 변환 될 수 있도록 프로그래밍 하는 방식
 *  실제 사용되는 참조 자료형으로의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식
 */
public class AGenericTest1 {

	public static void main(String[] args) {

		// 1. generic 이전 -> List에 어떤 data가 들어 있는지 알 수 없다
		ArrayList list1 = new ArrayList();
		list1.add( new String("hi") ); // Object type으로 저장된다
		list1.add( Integer.valueOf(777) ); // Object type으로 저장된다
		String s = (String) list1.get(0);
		Integer i = (Integer) list1.get(1);

		// 1. generic 이후
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add( Integer.valueOf(555) ); // Integer type으로 저장된다
//		list2.add( new String("hi") ); // error - <Integer>만 들어가는 list2
		Integer i2 = list2.get(0); // casting 필요 없음

	} // main

}
