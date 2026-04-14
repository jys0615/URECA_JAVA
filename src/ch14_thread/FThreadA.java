package ch14_thread;

public class FThreadA extends Thread {
	private FWorkObject workObject;

	public FThreadA(FWorkObject workObject) {
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}

