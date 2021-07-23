package com.dummyproject;

public class PrintArrayExt<T> {
	private T[] inputArray;

	public PrintArrayExt(T[] inputArray) {
		this.inputArray = inputArray;
	}

	public void toPrint() {
		PrintArrayExt.toPrint(this.inputArray);
	}

	public static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		new PrintArrayExt(intArray).toPrint();
			PrintArrayExt.toPrint(doubleArray);
			PrintArrayExt.toPrint(charArray);
	}

}
