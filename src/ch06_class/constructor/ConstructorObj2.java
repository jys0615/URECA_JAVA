package ch06_class.constructor;

public class ConstructorObj2 {

	public ConstructorObj2() {
		this("강감찬");
		System.out.println("파라미터 없음.");
	}

	public ConstructorObj2(String name) {
		this(name, 29);
		System.out.println("파라미터 하나.");
	}

	public ConstructorObj2(String name, int age) {
		System.out.println("파라미터 둘.");
		System.out.printf("%s는 %d세 입니다.\n", name, age);
	}

} // class
