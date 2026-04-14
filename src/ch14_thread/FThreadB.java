package ch14_thread;

public class FThreadB extends Thread {
	private FWorkObject workObject;

	public FThreadB(FWorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
