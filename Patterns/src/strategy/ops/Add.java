package strategy.ops;

/** Implements the algorithm using the strategy interface */
public class Add implements Strategy {
	public int execute(int a, int b) {
		System.out.println("Called Add's execute()");
		return a + b; // Do an addition with a and b
	}
};
