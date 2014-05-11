package exceptions;

public class Test {

	class MyException1 extends Exception {

	}

	class MyException2 extends RuntimeException {

	}

	class MyException3 extends Exception {

	}

	class MyException4 extends Exception {

	}

	public static void method1() throws MyException1 {

	}

	public static void method2() throws MyException2 {

	}

	public static void method3() throws MyException1, MyException2, MyException3, MyException4 {

	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		method2();

		try {
			method3();
		} catch (MyException2 e) {
			e.printStackTrace();
		} catch (MyException1 e) {
			//
		} catch (Exception e) {
			// db
		} catch (Throwable e) {
			//
		}

		try {
			method3();
		} catch (MyException2 | MyException1 | MyException3 e) {
			e.getMessage();
		} catch (MyException4 e) {
			e.getMessage();
		}

	}
}
