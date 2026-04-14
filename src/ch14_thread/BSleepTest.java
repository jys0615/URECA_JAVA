package ch14_thread;

import java.awt.Toolkit;

class SleepClass extends Thread {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for
	} // run
} // SleepClass

public class BSleepTest {

	public static void main(String[] args) {
		Thread t1 = new SleepClass();
		t1.start();
	} // main

}
