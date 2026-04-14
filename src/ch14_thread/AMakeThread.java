package ch14_thread;

// Thread를 만든다 -> 독립된 작업을 만든다
class ThreadClass extends Thread {
	public ThreadClass() {}
	public ThreadClass(String name) { super(name); }
	public void run() { // 독립된 작업
		for (int i = 0; i < 10000; i++) {
			System.out.println( this.getName() + " : " + i );
		}
	} // run
} // ThreadClass

public class AMakeThread {

	public static void main(String[] args) {
		Thread t1 = new ThreadClass("first");
		Thread t2 = new ThreadClass("second");
		t1.start();
		t2.start();
		System.out.println("===== end main =====");
	} // main

}
