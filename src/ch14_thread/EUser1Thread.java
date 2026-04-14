package ch14_thread;

public class EUser1Thread extends Thread {	
	private ECalculator calculator;
	
	public EUser1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(ECalculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
}
