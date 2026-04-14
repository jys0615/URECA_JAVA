package ch16_Lambda;

public class EPerson {
	public void action(ECalcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과: " + result);
	}
}
