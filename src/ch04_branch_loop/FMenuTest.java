package ch04_branch_loop;

import java.util.Scanner;

public class FMenuTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menuNum = 0;

		while (true) {
			System.out.println("메뉴 : 1 입력, 2 출력, 3 종료");
			System.out.print("메뉴 선택 : ");
			menuNum = scan.nextInt();
			if(menuNum == 3) break;
//			if(menuNum == 3) System.exit(0);
			System.out.println();
		} // while

		scan.close();
	} // main

}
