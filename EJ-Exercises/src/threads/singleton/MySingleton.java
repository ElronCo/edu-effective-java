package threads.singleton;

public class MySingleton {

	private static MySingleton INSTANCE;

	private MySingleton() {
		// 10 sn
	}

	private static Object lock = new Object();

	public static MySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (lock) {
				if (INSTANCE == null) {
					INSTANCE = new MySingleton();
				}
			}
		}
		return INSTANCE;
	}

}
