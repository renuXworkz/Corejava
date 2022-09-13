package com.xworkz.pharmacy.dao;

import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.ArrayFullException;

public abstract class PharmacyDAO {

	public abstract boolean save(PharmacyDTO dto) throws ArrayFullException;
	public abstract boolean update(String name,PharmacyDTO dto);
	public abstract boolean findByMedicineName(String name);
	
}
