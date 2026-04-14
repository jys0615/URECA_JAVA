package ch14_thread;

public class DYieldExample {
	public static void main(String[] args) {
		DWorkThread workThreadA = new DWorkThread("workThreadA");
		DWorkThread workThreadB = new DWorkThread("workThreadB");	
		workThreadA.start();		
		workThreadB.start();

		try { Thread.sleep(3000); } // 3초간 A와 B가 경쟁적 출력
		catch (InterruptedException e) {}
		workThreadA.work = false;

		try { Thread.sleep(3000); } // A.work = false -> 3초간 B만 출력
		catch (InterruptedException e) {}
		workThreadA.work = true; // 이후 계속 A와 B가 경쟁적 출력
	}
}

