package com.xworkz.inheritence;

public class BagOperator {

	public static void main(String[] args) {
		
		Bag bag=new Bag("leather","black","nike",1200.56f);
		System.out.println(bag.material);
		System.out.println(bag.color);
		System.out.println(bag.brand);
		System.out.println(bag.price);
		
		Bag wildcraft=new WildCraftBag("polyster","yellow","wildcraft",800.7f,"Bangalore",1998);
		
		Bag nike=new NikeBag("leather","white","nike",2000.9f,"america");
		
		BagCasting operator=new BagCasting();
		operator.casting(wildcraft);
		operator.casting(nike);
		operator.casting(bag);
		

	}

}
