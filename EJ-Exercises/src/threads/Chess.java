package threads;

public class Chess implements Runnable {

	@Override
	public void run() {
		move(Thread.currentThread().getId());
	}

	private synchronized void move(long id) {
		System.out.println(id + " ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println(id + " ");
	}

	public static void main(String[] args) {
		Chess chess = new Chess();
		new Thread(chess).start();
		new Thread(chess).start();
	}

}
