package com.xworkz.phonepe.services;

import com.xworkz.phonepe.dto.PhonePeDTO;
import com.xworkz.phonepe.exceptions.InvalidDataException;

public interface PhonePeServices {

	public abstract boolean validateAndSave(PhonePeDTO dto) throws InvalidDataException;
	public abstract boolean findDuplicate(PhonePeDTO dto);
	public abstract boolean validateAndUpdate(Long accountNum,PhonePeDTO dto) throws InvalidDataException;
	public abstract boolean deleteDTO(Long accountNum);
	public abstract boolean findCompanyInsuranceByCarNumber(String carNumber);
	public abstract boolean findRegisteredYearOfCar(String carNumber);
	public abstract boolean findbankByPhoneNumber(Long phonenUmber);
	public abstract boolean findPlanOfcarInsuranceByCarNumber(String carNum);
	
}
