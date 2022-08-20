package com.xworkz.inheritence;

public class BagCasting {

	
	public void casting(Bag bag)
	{
		if(bag instanceof WildCraftBag)
		{
			WildCraftBag wildcraft=(WildCraftBag)bag;
			System.out.println(wildcraft.brand);
			System.out.println(wildcraft.color);
			System.out.println(wildcraft.founded);
			System.out.println(wildcraft.material);
			System.out.println(wildcraft.headquarters);
			System.out.println(wildcraft.price);
		}
		else if(bag instanceof NikeBag)
		{
			NikeBag nike=(NikeBag)bag;
			System.out.println(nike.brand);
			System.out.println(nike.color);
			
			System.out.println(nike.material);
			System.out.println(nike.headquarters);
			System.out.println(nike.price);
			
		}
		else {
			System.out.println("no Object  is  instance of particular class");
		}
	}
}
