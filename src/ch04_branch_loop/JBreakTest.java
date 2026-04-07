package ch04_branch_loop;

public class JBreakTest {

	public static void main(String[] args) {

		System.out.println("========== level1. break는 일반적으로 가장 가까운 반복문을 빠져나간다 ==========");
		for(int dan=2; dan < 10; dan++) {

			for(int su=1; su < 10; su++) {
				System.out.printf("%d * %d = %d\t", dan, su, dan*su);
				if(su == 3) break;
			} // for

			System.out.println();
		} // for

		System.out.println("========== level2. break for label ==========");
		노재호:
		for(int dan=2; dan < 10; dan++) {

			for(int su=1; su < 10; su++) {
				System.out.printf("%d * %d = %d\t", dan, su, dan*su);
				if(su == 3) break 노재호;
			} // for

			System.out.println();
		} // for

		System.out.println("========== level3. continue는 수행을 건너 뛴다 ==========");
		for(int dan=2; dan < 10; dan++) {

			for(int su=1; su < 10; su++) {
				if(su == 3) continue;
				System.out.printf("%d * %d = %d\t", dan, su, dan*su);
			} // for

			System.out.println();
		} // for

	} // main

}
