package ch06_class.inherit;

public class InheritTest {

	public static void main(String[] args) {

		InheritChild1 ch1 = new InheritChild1();
		ch1.inheritName = "강감찬"; // 상속
		ch1.print();

		// 상속 (is a relationship) 관계는 다형성 가능.
		InheritSuper su0 = new InheritSuper();
		InheritSuper su1 = new InheritChild1();
		InheritSuper su2 = new InheritChild2();
//		InheritChild1 ch2 = new InheritSuper();
//		InheritChild1 ch3 = new InheritChild2();
//		InheritChild2 ch4 = new InheritSuper();
//		InheritChild2 ch5 = new InheritChild1();

	}

}
