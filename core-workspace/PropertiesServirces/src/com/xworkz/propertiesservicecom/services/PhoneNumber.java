package com.xworkz.propertiesservicecom.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.propertiesservice.exception.InvalidDataException;

public class PhoneNumber {
                     //[0][1][2][3][4][5]
	private Long[] phoneNumber=new Long[5];//phoneNumber[0]=9836352428L;//phoneNumber[1]=7353522L;
	private  int index = 0;
	                                    //null
	public boolean savePhoneNumber(Long phoneNum) throws InvalidDataException
	{                    //[6 7 8 9][9 digits]
		String regExp="^[6789]\\d{9}$";
		                //9      564748387
		if(phoneNum==null)
		{
		  System.out.println("Do not pass null value");
		  return false;
		}
	Pattern pattern=	Pattern.compile(regExp);
	Matcher match=pattern.matcher(phoneNum.toString());
	
	
	
	
	
	if(!match.matches())
	
	{
		
	    throw new InvalidDataException("invalid data format,invalid phone number");	
		}
	
		if(this.index<this.phoneNumber.length) {
			this.phoneNumber[this.index]=phoneNum;
			
			System.out.println("successfully added the phone Number at the index "+this.index);
			this.index++;
			return true;
		}
		System.out.println("Array is full,cannot add");
		return false;
	}
}
