package visitor.cars;

public class Engine implements ICarElement {
	public void accept(ICarElementVisitor visitor) {
		visitor.visit(this);
	}
}
