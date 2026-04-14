package ch14_thread;

public class FWaitNotifyExample {
	public static void main(String[] args) {
		FWorkObject workObject = new FWorkObject();
		
		FThreadA threadA = new FThreadA(workObject);
		FThreadB threadB = new FThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}
}
