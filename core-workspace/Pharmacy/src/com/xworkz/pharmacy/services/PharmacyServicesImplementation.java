package com.xworkz.pharmacy.services;

import java.util.Date;

import com.xworkz.pharmacy.dao.PharmacyDAO;
import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.InvalidDataException;

public class PharmacyServicesImplementation implements PharmacyServices{

	private PharmacyDAO dao;
	public PharmacyServicesImplementation(PharmacyDAO dao) {
		this.dao=dao;
	}
	
	@Override
	public boolean validateAndSave(PharmacyDTO dto) throws InvalidDataException {
		
		if(dto!=null)
		{
			if(dto.getName()==null || dto.getName().isEmpty() || dto.getName().length()<3)
			{
				throw new InvalidDataException("Inavlid name of pharmacy");
			}
			if(dto.getPlace()==null || dto.getPlace().isEmpty() || dto.getPlace().length()<3) {
				throw new InvalidDataException("Invalid place data");
			}
			
			if(dto.getGst()<=0 || dto.getGst()>=10000)
			{
				throw new InvalidDataException("Invalid gst data of pahramcy");
			}
			
			if(dto.getMedicineDTO()==null)
			{
				throw new InvalidDataException("Invalid format,do not pass null");
			}
			if(dto.getMedicineDTO().getName()==null || dto.getMedicineDTO().getName().isEmpty() || dto.getMedicineDTO().getName().length()<3)
			{
				throw new InvalidDataException("Invalid medicine name");
			}
			if(dto.getMedicineDTO().getDosage().length()>=1000)
			{
				throw new InvalidDataException("Invalid dosage for medicine");
			}
			if(dto.getMedicineDTO().getExpiryYear()<new Date().getYear()+1900)
			{
				throw new InvalidDataException("invalid Year for the Medicine");
			}
			
				boolean isSave=dao.save(dto);
				return isSave;
			}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean validateAndUpdate(String name, PharmacyDTO dto) throws InvalidDataException {
		if(dto!=null)
		{
			if(dto.getName()==null || dto.getName().isEmpty() || dto.getName().length()<3)
			{
				throw new InvalidDataException("Inavlid name of pharmacy");
			}
			if(dto.getPlace()==null || dto.getPlace().isEmpty() || dto.getPlace().length()<3) {
				throw new InvalidDataException("Invalid place data");
			}
			
			if(dto.getGst()<=0 || dto.getGst()>=10000)
			{
				System.out.println("***");
				throw new InvalidDataException("***Invalid gst data of pharmacy");
			}
			
			if(dto.getMedicineDTO()==null)
			{
				throw new InvalidDataException("Invalid format,do not pass null");
			}
			if(dto.getMedicineDTO().getName()==null || dto.getMedicineDTO().getName().isEmpty() || dto.getMedicineDTO().getName().length()<3)
			{
				throw new InvalidDataException("Invalid medicine name");
			}
			if(dto.getMedicineDTO().getDosage().length()>=1000)
			{
				throw new InvalidDataException("Invalid dosage for medicine");
			}
			if(dto.getMedicineDTO().getExpiryYear()<new Date().getYear()+1900)
			{
				throw new InvalidDataException("invalid Year for the Medicine");
			}
			boolean isUpdated=dao.update(name, dto);
			return isUpdated;
		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean findMedicineDetailsByName(String medicineName) {
		
	    dao.findByMedicineName(medicineName);
		return false;
	}

}
