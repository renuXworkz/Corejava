package com.xworkz.propertiesservicecom.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.propertiesservice.exception.ArrayFullException;
import com.xworkz.propertiesservice.exception.InvalidDataException;

public class UserNameService {

	private String[] userName=new String[4];
	private int counter=0;
	
	public boolean saveUserName(String userName) throws InvalidDataException
	
	{String regExp="^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*$";
		
	
	
		if(userName!=null)
		{
			Pattern pattern=Pattern.compile(regExp);
			Matcher match=pattern.matcher(userName);
			if(userName.length()<=3 || userName.length()>14 || !match.matches())
			{
				throw new InvalidDataException("Invalid username");
			}
			else if(this.counter<this.userName.length)
			{
				this.userName[this.counter]=userName;
				System.out.println("Saved the username at the index "+this.counter);
				this.counter++;
				return true;
			}
			else {
				throw new ArrayFullException("Array is full,cannot add");
			}
		}
		System.out.println("cannot add null");
		return false;
	}
}
