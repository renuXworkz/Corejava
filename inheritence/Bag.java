package com.xworkz.inheritence;

public class Bag {

	public String material;
	public String color;
	public String brand;
	public float price;

	public Bag() {
		System.out.println("invoked default no-arg constructor");
	}

	public Bag(String material, String color, String brand, float price)
	{
		// constructor chaining
		this(color, brand, price);
		System.out.println("Invoked parameterized Bag constructor");
		this.material = material;
	}

	public Bag(String color, String brand, float price) {
		// constructor chaining
		this(brand, price);
		this.color = color;

	}

	public Bag(String brand, float price) {
		this.brand = brand;
		this.price = price;
	}

	public void carryFruits() {
		System.out.println("Carry the fruits");
	}

	public void putGroceries() {
		System.out.println("Store the groceries");
	}

}
