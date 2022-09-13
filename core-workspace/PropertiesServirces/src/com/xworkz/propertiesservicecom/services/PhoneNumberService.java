package com.xworkz.propertiesservicecom.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.propertiesservice.exception.ArrayFullException;
import com.xworkz.propertiesservice.exception.InvalidDataException;

public class PhoneNumberService {

	private Long[] phoneNumber=new Long[4];
	private int count=0;
	
	public  boolean savePhoneNumber(Long phoneNumber) throws InvalidDataException {
		String regExp="^[789]\\d{9}$";
		
		if(phoneNumber!=null)
		{
			Pattern pattern=Pattern.compile(regExp);
			Matcher match=pattern.matcher(phoneNumber.toString());
			
			if(!match.matches())
			{
				throw new InvalidDataException("Invalid phone number");
				
			}
			else if(this.count<this.phoneNumber.length)
			{
				this.phoneNumber[this.count]=phoneNumber;
				System.out.println("Successfully saved phone number at the index "+this.count);
				this.count++;
				return true;
			}
			else {
				throw new ArrayFullException("Array is full,cannot add");
			}
		}
		return false;
	}
	/*
	public int recoverPassword(Long phoneNumber) {
		if(phoneNumber!=null)
		{
			for(int i=0;i<this.phoneNumber.length;i++)
			{
				if(this.phoneNumber[i]!=null && this.phoneNumber.equals(phoneNumber))
				{
					return (int)(Math.random()*(1000-100+1)+100);  
				}
			}
			
		}
		System.out.println("Phone number not found");
		return -1;
		
	}
	*/
	
}
