package com.xworkz.propertiesservice;


import com.xworkz.propertiesservice.exception.InvalidDataException;
import com.xworkz.propertiesservicecom.services.EmailService;
import com.xworkz.propertiesservicecom.services.PasswordService;
import com.xworkz.propertiesservicecom.services.PhoneNumber;
import com.xworkz.propertiesservicecom.services.PhoneNumberService;
import com.xworkz.propertiesservicecom.services.UserNameService;

public class PropertiesServiceRunner {

	public static void main(String[] args) throws InvalidDataException {
		/*
	   String email1="renu@gmail.com";
	   String email2="renu123had@gmail.com";
	   String email3="xyz@gmail.com";
	   String email4="shilpa@gmail.com";
	   String email5="abc1@gmail.com";
	  
	   
	   EmailService emailService=new EmailService();
	   try {
		   emailService.saveEmail(email1);
		   emailService.saveEmail(email2);
		   emailService.saveEmail(email3);
		   emailService.saveEmail(email4);
		 //  emailService.saveEmail(email5);
	   }
	   catch(ArrayFullException arr)
	   {
		   //arr.printStackTrace();
	   }
	   
	   catch(InvalidDataException e)
	   {
		   
	   }
	   
	   
	   String name1="renu_12";
	   String name2="krutika_123";
	   String name3="akash123";
	   String name4="shilpa";
	   
	   UserNameService name=new UserNameService();
	   try {
		   name.saveUserName(name1);
		   name.saveUserName(name2);
		   name.saveUserName(name3);
		   name.saveUserName(name4);
		   name.saveUserName(name4);
	   }
	   catch(ArrayFullException e)
	   {
		   
	   }
	   catch(InvalidDataException e)
	   {
		   
	   }
	   
	   
	   PasswordService password=new PasswordService();
	String   password1="Krutika#23g";
	String password2="dgdW1gd&g";
	String password3="Sru#5reh";
	String password4="dhkaiQY&*34";
	   try {
		   password.savePassword("Wej@portal20");
		   password.savePassword(password2);
		   password.savePassword(password1);
		   password.savePassword(password3);
		   password.savePassword(password4);
	   }
	   catch(ArrayFullException e)
	   {
		   
	   }
	   catch(InvalidDataException e)
	   {
		   
	   }
	   
	   PhoneNumberService phoneNumber=new PhoneNumberService();
	   
	   Long phoneNumber1=7483927272L;
	   Long phoneNumber2=8734583921L;
	   Long phoneNumber3=8734583965L;
	   Long phoneNumber4=9734583921L;
	   Long phoneNumber5=8463528373L;
	   try {
		   phoneNumber.savePhoneNumber(phoneNumber1);
		   phoneNumber.savePhoneNumber(phoneNumber2);
		   phoneNumber.savePhoneNumber(phoneNumber3);
		   phoneNumber.savePhoneNumber(phoneNumber4);
		   phoneNumber.savePhoneNumber(phoneNumber5);
		   
		   
	   }
	   catch(ArrayFullException e)
	   {
		   
	   }
	   catch(InvalidDataException e)
	   {
		   
	   }
	   
	   */
		
		
		
		
		PhoneNumber number=new PhoneNumber();
		
		number.savePhoneNumber(null);
		
		try {
		number.savePhoneNumber(685798668L);//9
		}
		catch(InvalidDataException excpt)
		{
			System.out.println("invalid phone number");
			
		}
		try {
		number.savePhoneNumber(4483739383L);//10
		}
		catch(InvalidDataException ex)
		{
			System.out.println("invalid");
		}
		
		/*
		number.savePhoneNumber(9483739383L);
		number.savePhoneNumber(1232539383L);
		number.savePhoneNumber(9483739383L);
		number.savePhoneNumber(9483739383L);
		*/
		//criteria 
		//[6 7 8 9][9 digits]
		
	}

}
