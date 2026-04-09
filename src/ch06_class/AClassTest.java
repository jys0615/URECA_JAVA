package ch06_class;

public class AClassTest {

	int i = 7;			String s = new String("hi");

	static int i2 = 79;	static String s2 = new String("hi9");

	public static void main(String[] args) {

//		System.out.println(i); // error - static은 non-static 영역에 접근할 수 없음
//		System.out.println(s); // error - i, s는 메모리에 없음

		System.out.println(i2);
		System.out.println(s2); // i2, s2는 메모리에 있음

		AClassTest test = new AClassTest();
		System.out.println(test.i);
		System.out.println(test.s); // 메모리에 올라간 test 내부의 i와 s 접근

	} // main

}
