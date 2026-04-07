package ch04_branch_loop;

public class AIfExample2 {

	public static void main(String[] args) {
		int score = 83;

		if(score >= 80) {
			System.out.println("등급은 B 입니다.");
		}
		if(score >= 70) {
			System.out.println("등급은 C 입니다.");
		}
		if(score >= 60) {
			System.out.println("등급은 D 입니다.");
		}

		if(score >= 90) {
			System.out.println("등급은 A 입니다.");
		}
		else if(score >= 80) {
			System.out.println("등급은 B 입니다.");
		}
		else if(score >= 70) {
			System.out.println("등급은 C 입니다.");
		}
		else if(score >= 60) {
			System.out.println("등급은 D 입니다.");
		}
		else {
			System.out.println("등급은 F 입니다.");
		}

	} // main

}
