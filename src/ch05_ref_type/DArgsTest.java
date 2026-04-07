package ch05_ref_type;

public class DArgsTest {

	public static void main(String[] args) { // 이 메소드를 실행하는 데 필요한 데이터를 집어넣는다.

		System.out.println("main 메소드 실행");

		if(args.length == 2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a + b);
		}

	}

}
