package statfactory;

public class Object2 {

	private final static Object2 INSTANCE = new Object2();

	private Object2() {
	}

	public static Object2 createObject() {
		return INSTANCE;
	}

}
