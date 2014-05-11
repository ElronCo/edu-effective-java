package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("I'm running");
	}

	public static void main(String[] args) {
		new MyThread().start();
		//
		new Thread(new MyTask()).start();
		// Composition over Inheritance

		ExecutorService threadPool = Executors.newFixedThreadPool(100);
		threadPool.execute(new MyTask());
	}

}
