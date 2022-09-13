package com.xworkz.pharmacy.services;

import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.InvalidDataException;

public interface PharmacyServices {

	
	boolean validateAndSave(PharmacyDTO dto) throws InvalidDataException;
	boolean validateAndUpdate(String name,PharmacyDTO dto)throws InvalidDataException;
	boolean findMedicineDetailsByName(String medicineName);
}
