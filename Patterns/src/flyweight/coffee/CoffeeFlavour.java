package flyweight.coffee;


// Instances of CoffeeFlavour will be the Flyweights
class CoffeeFlavour {
	private String name;

	CoffeeFlavour(String newFlavor) {
		this.name = newFlavor;
	}

	@Override
	public String toString() {
		return name;
	}
}
