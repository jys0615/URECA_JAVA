package ch06_class;

public class FStaticTest {

	int generalVar;
	static int staticVar;

	public static void main(String[] args) {

		System.out.println("staticVar : " + staticVar);

		// System.out.println(generalVar); // error
		// static은 먼저 메모리에 로딩되므로, 메모리에 없는 non-static은 접근 불가
		FStaticTest test = new FStaticTest();
		System.out.println("test.generalVar : " + test.generalVar);

		FStaticTest.staticVar++; // static은 클래스명을 통해서 접그 가능
		System.out.println("FStaticTest.staticVar : " + FStaticTest.staticVar);
		System.out.println("test.staticVar : " + test.staticVar);

		FStaticTest test2 = new FStaticTest();
		test2.staticVar++;
		System.out.println("FStaticTest.staticVar : " + FStaticTest.staticVar);
		System.out.println("test.staticVar : " + test.staticVar);
		System.out.println("test2.staticVar : " + test2.staticVar);
		//static 변수나 메소드는 메모리에 하나만 만들어지고 공유됨.

		test.generalVar = 777; test2.generalVar = 999;
		System.out.println("test.generalVar : " + test.generalVar);
		System.out.println("test2.generalVar : " + test2.generalVar);

	} // main

}
