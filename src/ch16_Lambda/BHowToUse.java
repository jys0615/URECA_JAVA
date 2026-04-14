package ch16_Lambda;

@FunctionalInterface
interface StrPrintLambda {
	public void print(String str);
}

public class BHowToUse {

	public static void main(String[] args) {

		StrPrintLambda sp1 = (String str)->{System.out.println(str);};
		sp1.print("=== 기본형 ===");

		// 매개변수가 하나인 경우, 매개변수 자료형과 소괄호 생략 가능
		StrPrintLambda sp2 = str->{System.out.println(str);};
		sp2.print("=== 매개변수가 하나인 경우 ===");

		// 중괄호 안의 구현부가 한 문장인 경우, 중괄호 생략 가능
		StrPrintLambda sp3 = str->System.out.println(str);
		sp3.print("=== 중괄호 안의 구현부가 한 문장인 경우 ===");

		SimpleLambda sim1 = (x,y)->{return x+y;};
		System.out.println( "기본형 : " + sim1.add(333, 444) );

		// 중괄호 안의 구현부가 return문장 하나인 경우, return과 중괄호 모두 생략 가능
		SimpleLambda sim2 = (x,y)->x+y;
		System.out.println( "중괄호 안의 구현부가 return문장 하나인 경우 : " + sim1.add(333, 444) );

		// 매개변수가 두개인 경우, 소괄호 생략 불가
//		SimpleLambda sim3 = x,y->x+y; // error

	} // main

}
