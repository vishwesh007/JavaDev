package com.infy;

@FunctionalInterface
interface Shape {
	public void draw();

	// public void area(); //Uncomment the abstract method to observe the difference

	public default Double area(Integer radius) {
		return radius * 3.14;
	}

	public default void fill(String color) {
		System.out.println("Inside default method fill");
	}

	public static void clean() {
		System.out.println("Inside static method");
	}
}

public class ShapeClient {
	public static void main(String[] args) {
		Shape.clean();
	}
}