package ch06_class;

public class FStaticTest2 {

	static { // 실행을 위해 클래스가 로딩될 때 딱 한번 무조건 실행되는 영역
		System.out.println(111);
	}

	static { // 실행을 위해 클래스가 로딩될 때 딱 한번 무조건 실행되는 영역
		System.out.println(222);
	}

	public static void main(String[] args) {

		FStaticTest2 test = new FStaticTest2();

	}

}
