package strategy.ops;

public class Multiply implements Strategy {
	public int execute(int a, int b) {
		System.out.println("Called Multiply's execute()");
		return a * b; // Do a multiplication with a and b
	}
};

// Configured with a ConcreteStrategy object and maintains
// a reference to a Strategy object
