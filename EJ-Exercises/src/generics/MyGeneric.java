package generics;

class X {

}

class MyClass {
	public int a;
}

class MyClass2 extends MyClass {
	public int b;
}

public class MyGeneric<T extends MyClass> {

	public static void main(String[] args) {
		MyGeneric<MyClass2> myGeneric = new MyGeneric<MyClass2>();
		myGeneric.method(new MyClass(), null);
		myGeneric.method(new MyClass2(), null);
	}

	public <E extends MyClass> void method(E e, T t) {
	}

}
