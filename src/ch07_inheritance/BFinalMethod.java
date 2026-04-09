package ch07_inheritance;

public class BFinalMethod {

	public final void finalMethod() {}
	public void generalMethod() {}
}

class BFinalMethodSub extends BFinalMethod {

//	public void finalMethod() {} // error - final method는 오버라이딩 불가
	public void generalMethod() {}
}
