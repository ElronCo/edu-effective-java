package inners;

public class Inners {

	class A {
	}

	static class X {

	}

	public static void main(String[] args) {
		Inners inners = new Inners();
		A a = inners.new A();

		X x1 = new Inners.X();
	}

}
