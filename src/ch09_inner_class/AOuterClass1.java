package ch09_inner_class;

public class AOuterClass1 {

	public class Inner1 {
		String s = "hi";
		Inner1() { System.out.println("인너클래스 생성자"); }
		public void print() { System.out.println("instance inner class method"); }
	} // Inner1 - instance inner class

	protected class Inner2 {} // instance inner class
	class Inner3 {} // instance inner class
	private class Inner4 {} // instance inner class

	public static class Inner5 {
		public static void print() { System.out.println("static inner class method"); }
	} // static inner class

	class Inner6 extends Inner2 {}

	public interface Inter11 {}
	protected interface Inter12 {}
	interface Inter13 {}
	private interface Inter14 {}

	interface Inter15 extends Inter11, Inter12, Inter13 {}

	class Inner7 implements Inter11, Inter12, Inter13 {}

} // class
