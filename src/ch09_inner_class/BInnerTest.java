package ch09_inner_class;

public class BInnerTest {

	public static void main(String[] args) {

		AOuterClass1 test = new AOuterClass1();

		AOuterClass1.Inner1 inner = test.new Inner1();
		inner.print();

		AOuterClass1.Inner5.print();

	} // main

}
