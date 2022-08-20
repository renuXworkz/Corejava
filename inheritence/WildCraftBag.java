package com.xworkz.inheritence;

public class WildCraftBag extends Bag{

	public String headquarters;
	public int founded;
	
	public WildCraftBag() {
		
		System.out.println("Invoked no-arg constructor");
	}
	
	public WildCraftBag(String material, String color, String brand, float price,String location,int founded)
	{  //constructor chaining
		super(material,color,brand,price);
		System.out.println("Invoked parameterized wilcraft constructor");
		this.headquarters=location;
		this.founded=founded;
	}
	
	
	
	public void carryCloths()
	{
		System.out.println("Outdoor Clothing");
	}
	
	
	
	
}
