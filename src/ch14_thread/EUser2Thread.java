package ch14_thread;

public class EUser2Thread extends Thread {	
	private ECalculator calculator;
	
	public EUser2Thread() {
		setName("User2Thread");
	}	
	
	public void setCalculator(ECalculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
