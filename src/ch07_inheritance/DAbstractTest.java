package ch07_inheritance;

// abstract class : 구체적인 부분이 생략 -> 객체 생성 불가
abstract class AbstractSuper {
	void print(){System.out.println("Super");}
	abstract void forOnlyOverRide();
	// abstract method : 부모에서 구현할 필요 없음(구현부 없음) + 자식은 반드시 구현해야 한다
}

// 추상 클래스를 상속 받으면 반드시 추상 메소드를 구현해야 객체 생성이 됨
class AbstractSub1 extends AbstractSuper {
	void print(){System.out.println("Sub1");}
	void forOnlyOverRide() {}
}

public class DAbstractTest {
	public static void main(String[] args) {

		AbstractSuper sup1 = new AbstractSub1();
		sup1.print();
		//오버라이딩 메소드는 부모 타입의 변수로 호출해도 자식 타입의 객체에 존재하는 메소드가 호출됨
	}
}
