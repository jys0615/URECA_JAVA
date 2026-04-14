package ch13_generic;

/*
 * 자료형 매개 변수 : 여러 참조 자료형으로 대체될 수 있는 부분을 하나의 문자로 표현한 것
 * <> : 다이아몬드 지시자
 * 와일드 카드 - E:Element, K:Key, V:Value, T:Data Type, N:Number, ?:모든 클래스
 */
public class AGenericTest2 {

	public static void main(String[] args) {

		AAllType<Integer> allInt = new AAllType<>();
		allInt.setMember( Integer.valueOf(777) );
		System.out.println( allInt.getMember() );

		AAllType<String> allStr = new AAllType<>();
		allStr.setMember( new String("hello") );
		System.out.println( allStr.getMember() );

	} // main

}
