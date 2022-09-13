package com.xworkz.amazonpay.interfaces;

public interface UPIPay {
    public abstract void fillHolderName(String name);
	public abstract void fillUPI(String id);
	public abstract void payAmount(double price);	
}
