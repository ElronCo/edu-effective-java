package decorator.coffee;

public class SimpleCoffee extends Coffee {
	public double getCost() {
		return 1;
	}

	public String getIngredients() {
		return "Coffee";
	}
}