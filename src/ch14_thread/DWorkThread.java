package ch14_thread;

public class DWorkThread extends Thread {

	public DWorkThread(String name) {
		setName(name);
	}

	public boolean work = true;

	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield();
			}
		}
	} // run
}
