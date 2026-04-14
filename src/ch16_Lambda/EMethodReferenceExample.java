package ch16_Lambda;

public class EMethodReferenceExample {
	public static void main(String[] args) {
		EPerson person = new EPerson();
		
		//정적 메소드일 경우
		//람다식
		//person.action((x, y) -> Computer.staticMethod(x, y));		
		//메소드 참조
		person.action(EComputer :: staticMethod);
		//person.action( (x, y) -> x + y );		

		//인스턴스 메소드일 경우
		EComputer com = new EComputer();
		//람다식
		//person.action((x, y) -> com.instanceMethod(x, y));		
		//메소드 참조
		person.action(com :: instanceMethod);
		//person.action( (x, y) -> x * y );		

	}
}

