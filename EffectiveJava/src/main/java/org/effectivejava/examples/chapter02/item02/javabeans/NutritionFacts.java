// JavaBeans Pattern - allows inconsistency, mandates mutability - Pages 12-13
package org.effectivejava.examples.chapter02.item02.javabeans;

public class NutritionFacts {
	// Parameters initialized to default values (if any)
	private int servingSize = -1; // Required; no default value
	private int servings = -1; // "     " "      "
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;

	public NutritionFacts() {
	}

	// Setters
	public NutritionFacts setServingSize(int val) {
		servingSize = val;
		return this;
	}

	public NutritionFacts setServings(int val) {
		servings = val;
		return this;
	}

	public NutritionFacts setCalories(int val) {
		calories = val;
		return this;
	}

	public NutritionFacts setFat(int val) {
		fat = val;
		return this;
	}

	public NutritionFacts setSodium(int val) {
		sodium = val;
		return this;
	}

	public NutritionFacts setCarbohydrate(int val) {
		carbohydrate = val;
		return this;
	}

	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts();
		cocaCola.setServingSize(240)//
				.setServings(8)//
				.setCalories(100)//
				.setSodium(35)//
				.setCarbohydrate(27);
	}
}