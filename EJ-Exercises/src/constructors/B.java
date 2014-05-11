package constructors;

public class B extends A {

	public B() {
		super(10);
		System.out.println("B-No arg");
	}

	public B(int x) {
		super(10);
		System.out.println("B-No arg");
	}

	public static void main(String[] args) {
		new B(10);
	}
}
