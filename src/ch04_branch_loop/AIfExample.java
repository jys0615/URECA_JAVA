package ch04_branch_loop;

public class AIfExample {

	public static void main(String[] args) {
		int score = 83;

		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}

		if(score >= 90) {
			System.out.println("등급은 A 입니다.");
		} 
		else if(score >= 80) {
			System.out.println("등급은 B 입니다.");
		}
		else if (score >= 80) {
			System.out.println("등급은 C 입니다.");
		}
		else if (score >= 70) {
			System.out.println("등급은 D 입니다.");
		}
		else if (score >= 60) {
			System.out.println("등급은 E 입니다.");
		}
		else {
			System.out.println("등급은 F 입니다.");
		}

	}

}
