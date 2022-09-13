package com.xworkz.propertiesservicecom.services;

import com.xworkz.propertiesservice.exception.ArrayFullException;
import com.xworkz.propertiesservice.exception.InvalidDataException;

public class EmailService {

	private String[] email=new String[4];
	private int counter=0;
	
	public boolean saveEmail(String email) throws InvalidDataException,ArrayFullException
	{
		if(email!=null)
		{
			if(email.length()<5 ||   !email.contains("@")   ||  !email.endsWith("gmail.com"))
			{
				throw new InvalidDataException("email is not valid");
			}
			else if(this.counter<this.email.length)
			{
			  this.email[this.counter]=email;
			  System.out.println("Saved email at the index "+this.counter);
			  this.counter++;
			  return true;
			}
			else
			{
				throw new ArrayFullException("Array is full,cannot add ");
			}
					
		}
		System.out.println("Email is null,cannot add");
		return false;
	}
	
}
