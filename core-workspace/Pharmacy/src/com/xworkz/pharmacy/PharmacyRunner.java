package com.xworkz.pharmacy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.pharmacy.dao.PharmacyDAO;
import com.xworkz.pharmacy.dao.PharmacyDAOImplementation;
import com.xworkz.pharmacy.dto.MedicineDTO;
import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.ArrayFullException;
import com.xworkz.pharmacy.exception.InvalidDataException;
import com.xworkz.pharmacy.services.PharmacyServices;
import com.xworkz.pharmacy.services.PharmacyServicesImplementation;


public class PharmacyRunner {

	public static void main(String[] args) {

		MedicineDTO medicineDTO1 = new MedicineDTO("Dolo 650", "600", 2022);
		PharmacyDTO pharmacyDTO1 = new PharmacyDTO("medplus", "btm", 3635, true, medicineDTO1);

		MedicineDTO medicineDTO2 = new MedicineDTO("Nexium", "200", 2024);
		PharmacyDTO pharmacyDTO2 = new PharmacyDTO("venkatesh", "rajajinagar", 3736, true, medicineDTO2);

		MedicineDTO medicineDTO3 = new MedicineDTO("Humira", "450", 2023);
		PharmacyDTO pharmacyDTO3 = new PharmacyDTO("Roopali", "whiteField", 7362, true, medicineDTO3);

		MedicineDTO medicineDTO4 = new MedicineDTO("enbel", "300", 2025);
		PharmacyDTO pharmacyDTO4 = new PharmacyDTO("Raghavendra", "bellandur", 876, true, medicineDTO4);

		PharmacyDAO dao = new PharmacyDAOImplementation();

		PharmacyServices services = new PharmacyServicesImplementation(dao);

		try {

			services.validateAndSave(pharmacyDTO1);
		}
		catch(ArrayFullException r)
		{
			
		}
		
		catch (InvalidDataException e) {

		}
		

		try {

			services.validateAndSave(pharmacyDTO2);
		} catch(ArrayFullException r)
		{
			
		}
		catch (InvalidDataException e) {

		}

		try {

			services.validateAndSave(pharmacyDTO3);
		}
		catch(ArrayFullException r)
		{
			
		}
		catch (InvalidDataException e) {

		}

		try {

			services.validateAndSave(pharmacyDTO4);
		} 
		catch(ArrayFullException r)
		{
			
		}
		catch (InvalidDataException e) {

		}
		
		services.findMedicineDetailsByName("Nexium");
		
		
		try {
			FileOutputStream file=new FileOutputStream("D:\\file4.txt");
			ObjectOutputStream out= new ObjectOutputStream(file);
			out.writeObject(pharmacyDTO4);
			out.close();
			file.close();
			System.out.println("object has been serialized");
		}
		catch(IOException e)
		{
			System.out.println("Invalid");
		}
		
		PharmacyDTO  dto7=null;
		try
        {   
            
            FileInputStream file = new FileInputStream("D:\\\\file4.txt");
            ObjectInputStream in = new ObjectInputStream(file);
              
           
            dto7= (PharmacyDTO)in.readObject();
              
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
			PharmacyDTO dto=(PharmacyDTO)pharmacyDTO4.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		PharmacyDTO dto5=pharmacyDTO4;//shallow copy
		
		pharmacyDTO4.setName("Diplai medicals");
		System.out.println(pharmacyDTO4.getName());
		
		PharmacyDTO pharmacyDTO5=new PharmacyDTO();//clone copy
		pharmacyDTO5.setPlace("whiteField");
		System.out.println(pharmacyDTO5.getPlace());
		

	}

}
