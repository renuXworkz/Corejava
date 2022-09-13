package com.xworkz.phonepe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.phonepe.constants.InsuranceCompany;
import com.xworkz.phonepe.dao.PhonePeDAO;
import com.xworkz.phonepe.dao.PhonePeDAOImplementation;
import com.xworkz.phonepe.dto.CarInsuranceDTO;
import com.xworkz.phonepe.dto.PhonePeDTO;
import com.xworkz.phonepe.dto.PlanDTO;
import com.xworkz.phonepe.exceptions.ArrayFullException;
import com.xworkz.phonepe.exceptions.InvalidDataException;
import com.xworkz.phonepe.services.*;


public class PhonePeRunner {

	public static void main(String[] args) {

		PlanDTO planDTO1 = new PlanDTO(InsuranceCompany.DIGITS, 3729.8, 1);
		CarInsuranceDTO carInsuranceDTO1 = new CarInsuranceDTO("KA27GT8574", "mahendra", "suv700", 2018, planDTO1);
		PhonePeDTO phonePeDTO1 = new PhonePeDTO("kavya", "kavya@gmail.com", 8756474847L, 63574648377L, "HDFC",
				"sbin5342467", carInsuranceDTO1);

		PlanDTO planDTO2 = new PlanDTO(InsuranceCompany.IFFCOTOKIO, 3729.8, 1);
		CarInsuranceDTO carInsuranceDTO2 = new CarInsuranceDTO("KA47MG9534", "tata", "tata234", 2020, planDTO2);
		PhonePeDTO phonePeDTO2 = new PhonePeDTO("sahana", "sahana@gmail.com", 7463538478L, 33574648373L, "IDBI",
				"sbin5342467", carInsuranceDTO2);

		PlanDTO planDTO3 = new PlanDTO(InsuranceCompany.ICICI, 3729.8, 2);
		CarInsuranceDTO carInsuranceDTO3 = new CarInsuranceDTO("KA27MA5534", "suzuli", "s873", 2014, planDTO3);
		PhonePeDTO phonePeDTO3 = new PhonePeDTO("janvi", "janvi@gmail.com", 9875748576L, 83983648373L, "sbi",
				"sbin5342467", carInsuranceDTO3);

		PlanDTO planDTO4 = new PlanDTO(InsuranceCompany.HDFCERGO, 3729.8, 2);
		CarInsuranceDTO carInsuranceDTO4 = new CarInsuranceDTO("KA27GD6835", "mahendra", "m763", 2000, planDTO4);
		PhonePeDTO phonePeDTO4 = new PhonePeDTO("shekar", "shekar@gmail.com", 8474647474L, 63574648373L, "axis",
				"sbin5342467", carInsuranceDTO4);

		PlanDTO planDTO5 = new PlanDTO(InsuranceCompany.RELIANCE, 3729.8, 1);
		CarInsuranceDTO carInsuranceDTO5 = new CarInsuranceDTO("KA73CD3536", "tata", "tata60", 2013, planDTO5);
		PhonePeDTO phonePeDTO5 = new PhonePeDTO("sudha", "sudha@gmail.com", 9875647484L, 33574648373L, "sbi",
				"sbin5342467", carInsuranceDTO5);

		PlanDTO planDTO6 = new PlanDTO(InsuranceCompany.DIGITS, 3729.8, 1);
		CarInsuranceDTO carInsuranceDTO6 = new CarInsuranceDTO("KA84KH9386", "mahendra", "ma700", 2016, planDTO6);
		PhonePeDTO phonePeDTO6 = new PhonePeDTO("geeta", "kavya@gmail.com", 9974783738L, 33574648373L, "icici",
				"sbin5342467", carInsuranceDTO6);

		PhonePeDAO dao = new PhonePeDAOImplementation();
		PhonePeServices services = new PhonePeServicesImplementation(dao);

		try {
			services.validateAndSave(phonePeDTO1);
		} catch (ArrayFullException e) {

		} catch (InvalidDataException e) {

		}
		try {
			services.validateAndSave(phonePeDTO2);
		} catch (ArrayFullException e) {

		} catch (InvalidDataException e) {

		}

		try {
			services.validateAndSave(phonePeDTO3);
		} catch (ArrayFullException e) {

		} catch (InvalidDataException e) {

		}
		try {
			services.validateAndSave(phonePeDTO4);
		} catch (ArrayFullException e) {

		} catch (InvalidDataException e) {

		}

		try {
			services.validateAndSave(phonePeDTO5);
		} catch (ArrayFullException e) {

		} catch (InvalidDataException e) {

		}

		try {
			services.validateAndSave(phonePeDTO6);
		} catch (ArrayFullException e) {

		} catch (InvalidDataException e) {

		}
		
		try {
			services.validateAndUpdate(63574648373L, phonePeDTO6);
		}
		catch(InvalidDataException e)
		{
			
		}
		
		services.deleteDTO(33574648373L);
		services.findCompanyInsuranceByCarNumber("KA47A6534");
		services.findRegisteredYearOfCar("KA27MA5534");
		services.findbankByPhoneNumber(9875748576L);
		services.findPlanOfcarInsuranceByCarNumber("KA73CD3536");
		

		try {
			FileOutputStream file=new FileOutputStream("D:\\file6.txt");
			ObjectOutputStream out= new ObjectOutputStream(file);
			out.writeObject(phonePeDTO6);
			out.close();
			file.close();
			System.out.println("object has been serialized");
		}
		catch(IOException e)
		{
			System.out.println("Invalid");
		}
		
		PhonePeDTO  phonePeDTO7=null;
		try
        {   
            
            FileInputStream file = new FileInputStream("D:\\file6.txt");
            ObjectInputStream in = new ObjectInputStream(file);
              
           
            phonePeDTO7= (PhonePeDTO)in.readObject();
              
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
			PhonePeDTO dto1=(PhonePeDTO)phonePeDTO7.clone();
		}
		catch(NullPointerException n)
		{
			
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		PhonePeDTO phonePeDTO8=phonePeDTO6;//shallow copy
		
		phonePeDTO8.setEmail("sanvi@gmail.com");
		System.out.println(phonePeDTO8.getEmail());
		
		PhonePeDTO dto6=new PhonePeDTO();//clone copy
		dto6.setEmail("janvi@gmail.com");
		System.out.println(dto6.getEmail());
		
		
	}

}
