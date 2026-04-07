package ch04_branch_loop;

public class EGuGuDan {

	public static void main(String[] args) {

		for (int sero = 1; sero <= 9; sero++) {
			for (int garo = 9; garo >= 1; garo--) {
				System.out.print(" ");
				if (sero == garo) break;
			}
			for (int garo = 1; garo < 9; garo++) {
				if (sero == garo)
					break;
				System.out.print("*");
			}
			System.out.println();
			// System.out.println("*");
		} // For

		// for (int dan = 1; dan <= 9; dan++) {
		// 	for (int su = 1; su <= 9; su++) {
		// 		System.out.printf("%d * %d = %d\t", dan, su, dan*su);
		// 	} // for
		// 	System.out.println();
		// }

	} // main

}

// 코테 문제 풀 때 3중 For문은 대부분 틀린다고 보면 된다.
// 대부분 2중첩까지 쓴다. 
// 별찍기 도전해봐라.
