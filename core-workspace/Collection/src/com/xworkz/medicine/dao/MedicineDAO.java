package com.xworkz.medicine.dao;

import java.util.List;

import com.xworkz.medicine.dto.MedicineDTO;

public interface MedicineDAO {

	public boolean save(MedicineDTO dto);
	public boolean findDuplicate(MedicineDTO dto);
	public boolean updateByDosage(int dosage,MedicineDTO dto);
	public List<MedicineDTO> findAllMedicine();
	public List<MedicineDTO> sortByDosage();
	public List<MedicineDTO> sortByLocation();
	public boolean delete(int dosage);
	public MedicineDTO findDTOByName(String name);

}
