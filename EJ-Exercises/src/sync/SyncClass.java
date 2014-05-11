package sync;

public class SyncClass {

	public synchronized void method1() {
	}

	public synchronized void method2() {
	}

	public void method3() throws InterruptedException {
		synchronized (this) {
			this.wait();
		}
	}

	public void method4() throws InterruptedException {
		synchronized (this) {
			this.notifyAll();
		}
	}

	public static void main(String[] args) {

	}

}
