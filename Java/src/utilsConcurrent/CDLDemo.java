package utilsConcurrent;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {

	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		System.out.println("starting");
		new Thread(new Mytread(cdl)).start();
		try {
			cdl.await();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Done");
	}
}

class Mytread implements Runnable {

	CountDownLatch latch;

	public Mytread(CountDownLatch c) {
		latch = c;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			latch.countDown();
		}
	}

}
