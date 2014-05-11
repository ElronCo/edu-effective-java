package test;

import java.util.concurrent.TimeUnit;

public class Test {

	public static int CONSTANT_X1 = 100;
	public static int CONSTANT_X2 = 200;
	public static int CONSTANT_X3 = 300;

	/*
	 * Buraya Const.CONSTANT_X degerlerinden uygun olani gonder...
	 * 
	 * @See
	 */
	public static void method1(int constx) {
	}

	public static void method2(Constants cons) {
		cons.value();
		cons.convert();
	}

	public static void main(String[] args) {
		method1(100);
		method2(Constants.CONST1);

		TimeUnit.DAYS.toHours(100);
	}

	enum Constants {
		CONST1(100), //
		CONST2(200), //
		CONST3(300);

		private int value;

		private Constants(int value) {
			this.value = value;
		}

		public void convert() {
			// TODO Auto-generated method stub

		}

		public int value() {
			return value;
		}

	}

}
