//Program to demonstrate generic interface
package com.tnsif.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

