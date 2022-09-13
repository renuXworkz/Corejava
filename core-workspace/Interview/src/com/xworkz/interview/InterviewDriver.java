package com.xworkz.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import com.xworkz.interview.dao.InterviewDAO;
import com.xworkz.interview.dao.InterviewDAOImplementation;
import com.xworkz.interview.dto.InterviewDTO;


public class InterviewDriver {

	
	
	public static void main(String[] args) {
		
		Date date1=new Date(2022,8,27,9,30);
		Date date2=new Date(2022,9,1,11,0);
		Date date3=new Date(2022,8,26,13,0);
		Date date4=new Date(2022,9,2,8,30);
		Date date5=new Date(2022,8,30,9,30);
		
		InterviewDTO dto1=new InterviewDTO(1, "xworkz", "renu",  2,"software engineer",date1);
		InterviewDTO dto2=new InterviewDTO(2, "Raymond", "Akshata",2, "fashion designer",date2);
		InterviewDTO dto3=new InterviewDTO(3, "TCS", "krutika", 2, "system engineer",date3);
		InterviewDTO dto4=new InterviewDTO(4, "jio", "akash",  3,"senior software developer",date4);
		InterviewDTO dto5=new InterviewDTO(5, "meesho", "pavan",  2,"sales executive",date5);
		
		InterviewDAOImplementation dao=new InterviewDAOImplementation();
	    dao.save(dto1);
	    dao.save(dto2);
	    dao.save(dto3);
	    dao.save(dto4);
	    dao.save(dto5);
	    dao.save(null);
	    dao.save(dto2);
	   System.out.println(dao.findDuplicate(dto3));
	   
	   dao.updateByDateOfInterview(date4,dto5);
	   dao.findDateOfInterviewAndNameById(-1);
	   dao.deleteById(2);
	   dao.findDateOfInterviewAndNameById(2);
	   
	   try {
			FileOutputStream file=new FileOutputStream("D:\\file3.txt");
			ObjectOutputStream out= new ObjectOutputStream(file);
			out.writeObject(dto4);
			out.close();
			file.close();
			System.out.println("object has been serialized");
		}
		catch(IOException e)
		{
			System.out.println("Invalid");
		}
		
	   InterviewDTO  dto7=null;
		try
       {   
           
           FileInputStream file = new FileInputStream("D:\\\\file3.txt");
           ObjectInputStream in = new ObjectInputStream(file);
             
          
           dto7= (InterviewDTO)in.readObject();
             
           in.close();
           file.close();
             
           System.out.println("Object has been deserialized ");
           
       }
         
       catch(IOException ex)
       {
           System.out.println("IOException is caught");
       }
         
       catch(ClassNotFoundException ex)
       {
           System.out.println("ClassNotFoundException is caught");
       }
		try {
			InterviewDTO dto=(InterviewDTO)dto4.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		InterviewDTO dto6=dto4;//shallow copy
		
		dto5.setCompanyName("wipro");
		System.out.println(dto4.getCompanyName());
		
		InterviewDTO dto8=new InterviewDTO();//clone copy
		dto6.setDesignation("ASE");
		System.out.println(dto6.getDesignation());
		
	
	  
	}

}
