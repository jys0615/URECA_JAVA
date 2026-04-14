package ch16_Lambda;

public class CLambdaExample {
	public static void main(String[] args) {

		action( (x, y) -> System.out.println("result: " + (x + y)) );

		action( (x, y) -> System.out.println("result: " + (x - y)) );

	}

	public static void action(CCalculable calculable) {
		calculable.calculate(10, 4);
	}

}
