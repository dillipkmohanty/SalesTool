package com.test.sales;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sales data = new Sales();
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("HELLO THIS IS THE MAIN CLASS");
		System.out.println("CALLING DISPLAY NOW");
	}

}
