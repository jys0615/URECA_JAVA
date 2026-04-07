package ch04_branch_loop;

import java.util.Scanner;

public class GCalcTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int fNum = 0, sNum = 0, result = 0;
		String giho = "+";

		while(true) {
			System.out.print("첫번째 정수 : ");
			fNum = scan.nextInt();
			System.out.print("기호(+ - * /), 탈출(x) 선택 : ");
			giho = scan.next();

			if(giho.equals("x") || giho.equalsIgnoreCase("X")) break;

			System.out.print("두번째 정수 : ");
			sNum = scan.nextInt();

			switch (giho) {
				case "+": result = fNum + sNum; break;
				case "-": result = fNum - sNum; break;
				case "*": result = fNum * sNum; break;
				case "/": result = fNum / sNum; break;
				default: result = 54405; System.out.println("error");
			}
			System.out.printf("%d %s %d = %d\n", fNum, giho, sNum, result);
			System.out.println();
		} //while
		System.out.println("=== 계산기 종료 ===");
		scan.close();
	} // main

}
