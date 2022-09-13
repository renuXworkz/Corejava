package com.xworkz.phonepe.dao;

import com.xworkz.phonepe.dto.PhonePeDTO;
import com.xworkz.phonepe.exceptions.ArrayFullException;

public interface PhonePeDAO {

	public abstract boolean save(PhonePeDTO phonepeDTO) throws ArrayFullException;
	public abstract boolean findDuplicate(PhonePeDTO phonepeDTO);
	public abstract boolean update(Long accountNumber,PhonePeDTO dto);
	public abstract boolean delete(Long accountNumber);
    public abstract boolean findCompanyInsuranceByCarNumber(String carNumber);
    public abstract boolean findRegisteredYearOfCar(String carNumber);
    public abstract boolean findbankByPhoneNumber(Long phoneNumber);
    public abstract boolean findPlanOfcarInsuranceByCarNumber(String carNum);
    
	
	
	
}
