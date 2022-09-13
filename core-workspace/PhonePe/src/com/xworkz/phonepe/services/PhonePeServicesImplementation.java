package com.xworkz.phonepe.services;

import java.util.Date;

import com.xworkz.phonepe.dao.PhonePeDAO;
import com.xworkz.phonepe.dto.PhonePeDTO;

import com.xworkz.phonepe.exceptions.InvalidDataException;

public class PhonePeServicesImplementation implements PhonePeServices {

	private PhonePeDAO dao;

	public PhonePeServicesImplementation(PhonePeDAO daos) {
		this.dao = daos;
	}

	@Override
	public boolean validateAndSave(PhonePeDTO dto) throws InvalidDataException {

		if (dto != null) {
			if (dto.getName() == null || dto.getName().isEmpty() || dto.getName().length() < 3) {
				throw new InvalidDataException("Invalid Data exception");
			}
			if (dto.getEmail().length() < 5 || !dto.getEmail().contains("@") || !dto.getEmail().endsWith("gmail.com")) {
				throw new InvalidDataException("email is not valid");
			}
			if (!dto.getPhoneNumber().toString().matches("^[789]\\d{9}$")) {
				throw new InvalidDataException("phone number is not valid");
			}
			if (!dto.getAccountNumber().toString().matches("^[0123456789]\\d{10}$")) {
				throw new InvalidDataException("account number is not valid");
			}
			if (dto.getBankName() == null || dto.getBankName().length() < 3
					|| dto.getBankName().length() >10) {
				throw new InvalidDataException("bank name is not valid");
			}
			if (dto.getCarInsuranceDTO() == null) {
				throw new InvalidDataException("Do not pass null");
			}
			if ((dto.getCarInsuranceDTO().getCarName().matches("^[A-Z]{2}\s[0-9]{2}\s[A-Z]{2}\s[0-9]{4}$"))) {
				throw new InvalidDataException("Invalid Format of car number");
			}
			if (dto.getCarInsuranceDTO().getCarName() == null || dto.getCarInsuranceDTO().getCarName().length() >10 
					|| dto.getCarInsuranceDTO().getCarName().length() < 3) {
				throw new InvalidDataException("invalid Car name");
			}
			if (dto.getCarInsuranceDTO().getModel() == null || dto.getCarInsuranceDTO().getModel().length() < 3 || dto.getCarInsuranceDTO().getModel().length() >10) {
				throw new InvalidDataException("Invalid model number");

			}

			if (dto.getCarInsuranceDTO().getRegisteredYear() > new Date().getYear() + 1900) {
				throw new InvalidDataException("Year is not valid");
			}

			if (dto.getCarInsuranceDTO().getPlanDTO() == null) {
				throw new InvalidDataException("Do not pass null");

			}
			if (dto.getCarInsuranceDTO().getPlanDTO().getCompanyName() == null) {
				throw new InvalidDataException("Invalid Company name");
			}
			if (dto.getCarInsuranceDTO().getPlanDTO().getInsurancePrice() < 500) {
				throw new InvalidDataException("Invalid price");
			}
			if (dto.getCarInsuranceDTO().getPlanDTO().getYearCoverage() <= 0) {
				throw new InvalidDataException("invalid coverage year");
			}

			boolean isDuplicate = findDuplicate(dto);
			if (!isDuplicate) {
				boolean isSave = dao.save(dto);
				if (isSave) {
					return true;
				}
			} else {
				System.out.println("Duplicate found. cannot save");
				return false;
			}

		}
		System.out.println("Do not pass null. cannot save");
		return false;
	}

	@Override
	public boolean findDuplicate(PhonePeDTO dto) {
		return dao.findDuplicate(dto);

	}

	@Override
	public boolean validateAndUpdate(Long accountNum, PhonePeDTO dto) throws InvalidDataException {
		if(dto!=null)
		{
			boolean isDuplicate=findDuplicate(dto);
			if(!isDuplicate)
			{
				if (dto.getName() == null || dto.getName().isEmpty() || dto.getName().length() < 3) {
					throw new InvalidDataException("Invalid Data exception");
				}
				if (dto.getEmail().length() < 5 || !dto.getEmail().contains("@") || !dto.getEmail().endsWith("gmail.com")) {
					throw new InvalidDataException("email is not valid");
				}
				if (!dto.getPhoneNumber().toString().matches("^[789]\\d{9}$")) {
					throw new InvalidDataException("phone number is not valid");
				}
				if (!dto.getAccountNumber().toString().matches("^[0123456789]\\d{10}$")) {
					throw new InvalidDataException("account number is not valid");
				}
				if (dto.getBankName() == null || dto.getBankName().length() < 3
						|| dto.getBankName().matches("^[a-zA-Z]$")) {
					throw new InvalidDataException("bank name is not valid");
				}
				if (dto.getCarInsuranceDTO() == null) {
					throw new InvalidDataException("Do not pass null");
				}
				if (dto.getCarInsuranceDTO().getCarName().matches("^[a-zA-Z][a-zA-Z]\\[0-9][0-9]\\[a-zA-Z]\\d{4}$")) {
					throw new InvalidDataException("Invalid Format of car number");
				}
				if (dto.getCarInsuranceDTO().getCarName() == null || dto.getCarInsuranceDTO().getCarName().isEmpty()
						|| dto.getCarInsuranceDTO().getCarName().length() < 3) {
					throw new InvalidDataException("invalid Car name");
				}
				if (dto.getCarInsuranceDTO().getModel() == null || dto.getCarInsuranceDTO().getModel().length() < 3) {
					throw new InvalidDataException("Invalid model number");

				}

				if (dto.getCarInsuranceDTO().getRegisteredYear() > new Date().getYear() + 1900) {
					throw new InvalidDataException("Year is not valid");
				}

				if (dto.getCarInsuranceDTO().getPlanDTO() == null) {
					throw new InvalidDataException("Do not pass null");

				}
				if (dto.getCarInsuranceDTO().getPlanDTO().getCompanyName() == null) {
					throw new InvalidDataException("Invalid Company name");
				}
				if (dto.getCarInsuranceDTO().getPlanDTO().getInsurancePrice() < 500) {
					throw new InvalidDataException("Invalid price");
				}
				if (dto.getCarInsuranceDTO().getPlanDTO().getYearCoverage() <= 0) {
					throw new InvalidDataException("invalid coverage year");
				}
				
				dao.update(accountNum, dto);
				return true;

			}
		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean deleteDTO(Long accountNum) {
		
		return dao.delete(accountNum);
	}

	@Override
	public boolean findCompanyInsuranceByCarNumber(String carNumber) {
		return dao.findCompanyInsuranceByCarNumber(carNumber);
		
	}

	@Override
	public boolean findRegisteredYearOfCar(String carNumber) {
		// TODO Auto-generated method stub
		return dao.findRegisteredYearOfCar(carNumber);
	}

	@Override
	public boolean findbankByPhoneNumber(Long phonenUmber) {
		
		return dao.findbankByPhoneNumber(phonenUmber);
	}

	@Override
	public boolean findPlanOfcarInsuranceByCarNumber(String carNum) {
		
		return dao.findPlanOfcarInsuranceByCarNumber(carNum);
	}
}
