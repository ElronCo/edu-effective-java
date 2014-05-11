package visitor.cars;

interface ICarElementVisitor {
	void visit(Wheel wheel);

	void visit(Engine engine);

	void visit(Body body);

	void visit(Car car);
}

public interface ICarElement {
	void accept(ICarElementVisitor visitor); // CarElements have to provide
												// accept().
}
