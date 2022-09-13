package com.xworkz.medicine.services;

import java.util.List;

import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dto.MedicineDTO;
import com.xworkz.medicine.exception.InvalidDataException;

public interface MedicineServices {

	
	public boolean validate(MedicineDTO dto) throws InvalidDataException;
	
	public boolean save(MedicineDTO dto) throws InvalidDataException;
	
	public boolean update(int dosage,MedicineDTO dto)throws InvalidDataException;
	
	public List<MedicineDTO> findAllMedicine();

	public List<MedicineDTO> sortByDosage();
	
	public List<MedicineDTO> sortByLocation();
	public boolean deleteByDosage(int dosage);
	public List<MedicineDTO> findDTOByName(String name);
	
}
