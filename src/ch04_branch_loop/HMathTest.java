package ch04_branch_loop;

public class HMathTest {

	/*
	 * Math class : 수학과 관련된 기능들을 가진 클래스
	 */
	public static void main(String[] args) {

		double dVar = Math.PI, dVar2 = 0.4, dVar3 = 0.5;
		System.out.println(dVar);
		System.out.println(Math.ceil(dVar)); // 올림
		System.out.println(Math.floor(dVar)); // 내림
		System.out.println(Math.round(dVar2)); // 반올림
		System.out.println(Math.round(dVar3)); // 반올림
		System.out.println(Math.log(4.0));
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.max(2.0, 5.0));
		System.out.println(Math.min(2.0, 5.0));
		System.out.println(Math.sqrt(16.0)); // 근의 공식 

	}

}
