package com.xworkz.amazonpay.interfaces;

public interface DebitCardPay {
   public final  int cvv=9;
	
	public abstract void fillDebitCardDetails(int cvv,int expYear,int month);
	public abstract void fillAccountHolderName(String holderName);
	public abstract void payAmount(double amount);
	
	//100% abstraction
	//no constrctor
	
	
}
