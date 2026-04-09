package ch06_class.constructor;

public class ConstructorTest {

	public static void main(String[] args) {

		ConstructorObj test = new ConstructorObj();
		System.out.println(test.noValue);
		System.out.println(test.value);

		ConstructorObj test2 = new ConstructorObj(99999);
		System.out.println(test2.noValue);
		System.out.println(test2.value);

		ConstructorObj2 test3 = new ConstructorObj2();

	}

}
