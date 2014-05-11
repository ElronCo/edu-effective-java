package reflection;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Customer {

	private String name;
	private double balance;

	// public Customer() {
	// }

	public Customer(String name) {
		this.setName(name);
	}

	public Customer(String name, int balance) {
		this.balance = balance;
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	static Map<String, Object> map = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "Customer [name=" + name + ", balance=" + balance + "]";
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		String className = "reflection.Customer";
		//
		Class<?> customerClass = Class.forName(className);

		Constructor<?> constructor = customerClass.getConstructor(String.class, int.class);
		Object newInstance = constructor.newInstance("Ahmet", 100);
		//
		// map.put(className, customer);
		// System.out.println(customer);
	}

}
