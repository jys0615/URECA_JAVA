package ch06_class.pack.sub1;

public class PrivateTest {

	private int priVar = 999;
	int defaultVar = 888;
	protected int proVar = 777;
	public int publicVar = 555;

	public static void main(String[] args) {
		PrivateTest test = new PrivateTest();
		System.out.println("test.priVar : " + test.priVar);
		System.out.println("test.defaultVar : " + test.defaultVar);
		System.out.println("test.proVar : " + test.proVar);
		System.out.println("test.publicVar : " + test.publicVar);
	}

}
