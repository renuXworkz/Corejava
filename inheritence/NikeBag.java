package com.xworkz.inheritence;

public class NikeBag extends Bag{

	
	public String headquarters;
	
	public NikeBag() {
		System.out.println("invoked no-arg constructor");
	}
	
	public NikeBag(String material, String color, String brand, float price,String location)
	{//constructor chaining
		super(material,color,brand,price);
		System.out.println("Invoked parameterized nike constructor");
		this.headquarters=location;
	}
	
	
	public void advertiseBrand()
	{
		System.out.println("Promotes Brand through advertisement");
	}
	
	
}
