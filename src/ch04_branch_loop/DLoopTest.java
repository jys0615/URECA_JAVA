package ch04_branch_loop;

public class DLoopTest {

	public static void main(String[] args) {

		for (int k = 1; k <= 10; k++) {
			System.out.println("k : " + k);
		}

		int i = 1; // 조건. 탈출 조건, 혹은 횟수 조건
		while(i <= 10) {
			System.out.println("i : " + i);
			i++;
		} // while

	} // main

} // class
