package threads;

public class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println("I'm running again");
	}

}
