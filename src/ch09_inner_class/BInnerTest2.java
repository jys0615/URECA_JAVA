package ch09_inner_class;

public class BInnerTest2 {

	public void outerMethod() {

		class LocalInner {
			public String innerStr = "local";
			public void print() {
				System.out.println("LocalInner str : " + innerStr);
			} // print
		} // class LocalInner

		LocalInner inner = new LocalInner();
		inner.print();
	} // outerMethod

	public static void main(String[] args) {
		BInnerTest2 test = new BInnerTest2();
		test.outerMethod();
	}

}
