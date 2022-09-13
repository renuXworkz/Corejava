package com.xworkz.propertiesservicecom.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.propertiesservice.exception.ArrayFullException;
import com.xworkz.propertiesservice.exception.InvalidDataException;

public class PasswordService {

	private String[] password=new String[4];
	private int count=0;
	
	public  boolean savePassword(String password) throws InvalidDataException
	{ String regExp= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
	
	
		if(password!=null)
		{
			Pattern pattern=Pattern.compile(regExp);
			Matcher match=pattern.matcher(password);
			if(!match.matches())
			{
				throw new InvalidDataException("Invalid password");
			}
			else if(this.count<this.password.length)
			{
				this.password[this.count]=password;
				System.out.println("saved password at the index "+this.count);
				this.count++;
				return true;
			}
			else {
				throw new ArrayFullException("Arrya is full,cannot add");
				
			}
		}
		System.out.println("cannot add null");
		return false;
	}
}
