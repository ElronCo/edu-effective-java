package org.effectivejava.examples.chapter02.item05;

public class Sum {
	// Hideously slow program! What's wrong ?
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		//
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		//
		time = System.currentTimeMillis() - time;
		System.out.println("It took [" + time + "] ms to calculate: " + sum);
	}

}
