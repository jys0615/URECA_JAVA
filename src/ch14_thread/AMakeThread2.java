package ch14_thread;

class RunnableClass implements Runnable {
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(this.hashCode() + " : " +  i );
		} // for
	} // run
} // RunnableClass

public class AMakeThread2 {

	public static void main(String[] args) {
		RunnableClass r1 = new RunnableClass();
		Thread t1 = new Thread(r1);
		t1.start();

		RunnableClass r2 = new RunnableClass();
		Thread t2 = new Thread(r2);
		t2.start();
	} // main

}
