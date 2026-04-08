package ch06_class;

public class AClassTest {

	int i = 7;			String s = new String("hi"); // 메인에서 이걸 호출하면 오류 발생. 메모리에 안 올라갔기 때문. Static이 없는 애들은 new를 받기 전에 안 올라감. 

	static int i2 = 79;	static String s2 = new String("hi9"); // 오류 없음. 

	public static void main(String[] args) {

//		System.out.println(i); // error - static은 non-static 영역에 접근할 수 없음
//		System.out.println(s); // error - i, s는 메모리에 없음

		System.out.println(i2);
		System.out.println(s2); // i2, s2는 메모리에 있음

		AClassTest test = new AClassTest(); // static이 아닌 것은 new를 통해 메모리에 올려야 접근 가능. test라는 객체가 메모리에 올라감.
		System.out.println(test.i);
		System.out.println(test.s); // 메모리에 올라간 test 내부의 i와 s 접근

	} // main

} // class
// 자바는 new를 통해 메모리 할당
// 프로그래머가 메모리 할당하기 전에 먼저 할당해야 할 것이 있다. JVM이 알아서 할당. 
// 대표적인 것이 public static void main(String[] args)
