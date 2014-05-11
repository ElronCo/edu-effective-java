package threads.locks;

import java.util.concurrent.TimeUnit;

public class MyClass {

	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	public void method1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		synchronized (lock1) {
			System.out.println(Thread.currentThread().getName() + ": Method1 has completed");
		}
	}

	public void method2() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		synchronized (lock2) {
			System.out.println(Thread.currentThread().getName() + ": Method2 has completed");
		}
	}

	public void method3() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		synchronized (lock2) {
			System.out.println(Thread.currentThread().getName() + ": Method2 has completed");
		}
	}

	public static void main(String[] args) {
		final MyClass myClass = new MyClass();
		new Thread(new MyTask(myClass), "Thread1").start();
		new Thread(new MyTask2(myClass), "Thread2").start();
	}

	static class MyTask implements Runnable {

		private final MyClass cls;

		public MyTask(MyClass cls) {
			this.cls = cls;
		}

		@Override
		public void run() {
			try {
				cls.method1();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	static class MyTask2 implements Runnable {

		private final MyClass cls;

		public MyTask2(MyClass cls) {
			this.cls = cls;
		}

		@Override
		public void run() {
			try {
				cls.method2();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
