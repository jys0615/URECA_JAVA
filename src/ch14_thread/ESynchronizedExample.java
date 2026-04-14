package ch14_thread;

public class ESynchronizedExample {
	public static void main(String[] args) {
		ECalculator calculator = new ECalculator();
		
		EUser1Thread user1Thread = new EUser1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();

		EUser2Thread user2Thread = new EUser2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start(); 
	}
}
