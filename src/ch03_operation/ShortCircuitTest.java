package ch03_operation;

public class ShortCircuitTest {

	public static void main(String[] args) {

//		if( 1 < 2 | (5/0) < 2) System.out.println("| TRUE");
		// ArithmeticException: / by zero : 좌항과 우항 모두 검사

		/*
		 * ShortCircuitLogic
		 * || : 좌항의 값이 true면 우항을 검사하지 않는다
		 * && : 좌항의 값이 false면 우항을 검사하지 않는다
		 */
		if( 1 < 2 || (5/0) < 2) System.out.println("|| TRUE");

		if( 1 > 2 && (5/0) < 2) System.out.println("&& FALSE");
	}

}



