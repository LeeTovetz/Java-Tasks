package com.task001;

public class Main {

	public static void main(String[] args) {
		final ThreeStrings worker = new ThreeStringsImpl();

		System.out.println("Hi. Type three lines of something ...");

		worker.readFirst();
		worker.readSecond();
		worker.readThird();

		worker.printFirstAndThird();
		worker.printThirdSecondAndFirst();
		worker.printFirstSecondAndThird();

	}
}
