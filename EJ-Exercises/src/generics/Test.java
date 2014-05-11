package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

	static class A {
	}

	static class B extends A {
	}

	static class C extends B {
	}

	public static void main(String[] args) {

		List<? super B> a = new ArrayList<B>();
		a.add(new B());
		a.add(new C());

	}

}
