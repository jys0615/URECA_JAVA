package ch04_branch_loop;

import java.util.Random;

public class IRandomTest {

	public static void main(String[] args) {
		double dRandom = Math.random(); // ***랜덤 수 발생 : 0.0 이상 ~ 1.0 미만***
		System.out.println(dRandom);

		//1부터 45까지의 수 중에서 임의의 수를 발생 시키려면?
		double lottoNum = Math.random() * 45; // 0 ~ 44 까지 발생
		double lottoNum2 = Math.random() * 45 + 1; // 1 ~ 45 까지 발생
		System.out.println(lottoNum);
		System.out.println(lottoNum2);
		System.out.println( (int) lottoNum );
		System.out.println( (int) lottoNum2 );

		Random random = new Random();
		System.out.println("random.nextInt : " + random.nextInt());
		System.out.println("random.nextInt(45) : " + random.nextInt(45));
	}

}
