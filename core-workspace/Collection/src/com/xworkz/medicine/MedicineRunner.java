package com.xworkz.medicine;

import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dao.MedicineDAOImp;
import com.xworkz.medicine.dto.MedicineDTO;
import com.xworkz.medicine.exception.InvalidDataException;
import com.xworkz.medicine.services.MedicineServices;
import com.xworkz.medicine.services.MedicineServicesImp;
import com.xworkz.medicine.sorter.DosageSorter;

public class MedicineRunner {

	public static void main(String[] args) {
		
		MedicineDTO dto1=new MedicineDTO("paracitamol","davanagere",300,2022);
		MedicineDTO dto2=new MedicineDTO("lopamide","btm",250,2023);
		MedicineDTO dto3=new MedicineDTO("adderall","rajajinagar",500,2025);
		MedicineDTO dto4=new MedicineDTO("syntroid","medikeri",300,2022);
		MedicineDTO dto5=new MedicineDTO("dolo650","bangalore",650,2024);
		
		MedicineDAO dao=new MedicineDAOImp();
		
		MedicineServices services=new MedicineServicesImp(dao);
		
		
		
		try {
			System.out.println();
			services.save(dto1);
			
		} catch (InvalidDataException e) {
			
		}
		
		try {
			System.out.println();
			services.save(dto2);
		} catch (InvalidDataException e) {
		
		}
		
		try {
			System.out.println();
			services.save(dto3);
		} catch (InvalidDataException e) {
		
		}
		try {
			System.out.println();
			services.save(dto4);
		} catch (InvalidDataException e) {
			
		}
		services.findAllMedicine();
		
		
		System.out.println();
		services.findAllMedicine();
		
		
	System.out.println();	
	services.sortByDosage();
	
	System.out.println();
	services.sortByLocation();
	services.deleteByDosage(250);
	
	services.findAllMedicine();
	
	try {
		System.out.println();
		services.update(300, dto5);
	} catch (InvalidDataException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println();
	services.findAllMedicine();
	System.out.println();
	services.findDTOByName("adderall");
	
	}

}
