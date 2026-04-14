package ch14_thread;

class JoinClass extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println( this.getName() + " : " + i );
		}
	} // run
} // ThreadClass

public class CJoinTest {

	public static void main(String[] args) {
		Thread t1 = new JoinClass();
		t1.start();
		try {
			t1.join(); // t1이 끝날 때까지 main 쓰레드는 대기 상태
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("===== end main =====");
	} // main

}
