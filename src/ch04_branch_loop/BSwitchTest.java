package ch04_branch_loop;

public class BSwitchTest {

	public static void main(String[] args) {

		int a = 2;
		switch(a) {
		case 1 : System.out.println("1-정수 1"); break;
		case 2 : System.out.println("1-정수 2"); break;
		case 3 : System.out.println("1-정수 3"); break;
		default : System.out.println("1-default"); break;
		}
		//해당하는 case문 아래로 모두 수행하기 때문에 break 필요
		// break : 가장 가까운 {}를 빠져 나간다

		double b = 2.0;
//		switch(b) { // error - double 안됨
//		case 1.0 : System.out.println("실수 1"); break;
//		case 2.0 : System.out.println("실수 2"); break;
//		case 3.0 : System.out.println("실수 3"); break;
//		default : System.out.println("default"); break;
//		}

		char c = 'B';
		switch(c) {
		case 'A' : System.out.println("3-정수 1"); break;
		case 'B' : System.out.println("3-정수 2"); break;
		case 'C' : System.out.println("3-정수 3"); break;
		default : System.out.println("3-default"); break;
		}

		byte d = 2;
		switch(d) {
		case 1 : System.out.println("4-정수 1"); break;
		case 2 : System.out.println("4-정수 2"); break;
		case 3 : System.out.println("4-정수 3"); break;
		default : System.out.println("4-default"); break;
		}

		short sh = 2;
		switch(sh) {
		case 1 : System.out.println("5-정수 1"); break;
		case 2 : System.out.println("5-정수 2"); break;
		case 3 : System.out.println("5-정수 3"); break;
		default : System.out.println("5-default"); break;
		}

		long e = 2L;
//		switch(e) { // error - long 안됨
//		case 1L : System.out.println("정수 1"); break;
//		case 2L : System.out.println("정수 2"); break;
//		case 3L : System.out.println("정수 3"); break;
//		default : System.out.println("default"); break;
//		}

		String f = "hello";
		switch(f) {
		case "hi" : System.out.println("문자열 1"); break;
		case "hello" : System.out.println("문자열 2"); break;
		case "hoe are you" : System.out.println("문자열 3"); break;
		default : System.out.println("default"); break;
		}

	} //main

}
