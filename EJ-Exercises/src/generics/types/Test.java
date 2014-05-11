package generics.types;

public class Test {

	public void method() {
		// x

	}

	public static void main(String[] args) {
		// List<Dog> dogs = new ArrayList<Dog>();
		// List<Animal> animals = dogs;
		// animals.add(new Cat());
		// Dog dog = dogs.get(0);

		Test test = new Test() {
			@Override
			public void method() {
				// y
			}
		};
	}

}
