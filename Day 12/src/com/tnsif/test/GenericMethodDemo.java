package com.tnsif.test;

public class GenericMethodDemo {

	public static void main(String[] args) {

		GenericMethod gm = new GenericMethod();

		String[] names = { "Hitakshi", "Arya", "Rutuja" };

		gm.displayArrayElements(names);

		Integer[] values = { 1, 7, 8, 9, 3, 5, 9 };
		gm.displayArrayElements(values);
		gm.print("Nayna");
		gm.print(10);
	}

}
