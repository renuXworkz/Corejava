package com.xworkz.phonepe.dao;

import com.xworkz.phonepe.dto.PhonePeDTO;
import com.xworkz.phonepe.exceptions.ArrayFullException;

public class PhonePeDAOImplementation implements PhonePeDAO {
	private PhonePeDTO[] dto = new PhonePeDTO[5];
	private int counter = 0;

	@Override
	public boolean save(PhonePeDTO phonepeDTO) {
		if (phonepeDTO != null) {

			if (this.counter < this.dto.length) {
				this.dto[this.counter] = phonepeDTO;
				System.out.println("successfully added dto at index " + this.counter);
				this.counter++;
				return true;
			} else {
				throw new ArrayFullException("Array is full.Cannot add");
			}
		}
		System.out.println("Do not pass null");
		return false;

	}

	@Override
	public boolean findDuplicate(PhonePeDTO phonepeDTO) {

		if (phonepeDTO != null) {
			for (int i = 0; i < this.dto.length; i++) {
				if (this.dto[i] != null && this.dto[i].equals(phonepeDTO)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(Long accountNumber, PhonePeDTO dto) {
		if (dto == null) {
			System.out.println("Do not pass null");
			return false;
		}

		for (int a = 0; a < this.dto.length; a++) {
			if (this.dto[a] != null && this.dto[a].getAccountNumber().equals(accountNumber)) {
				this.dto[a] = dto;
				System.out.println("updated successfully at the index " + a);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Long accountNumber) {
		for (int z = 0; z < this.dto.length; z++) {
			if (this.dto[z] != null && this.dto[z].getAccountNumber().equals(accountNumber))

			{
				this.dto[z] = null;
				System.out.println("deleted at the index " + z);
				return true;
			}
		}
		System.out.println("cannot delete");
		return false;
	}

	@Override
	public boolean findCompanyInsuranceByCarNumber(String carNumber) {
		if (carNumber == null) {
			System.out.println("Do not pass null value");
			return false;
		}
		for (int a = 0; a < this.dto.length; a++) {
			if (this.dto[a] != null && this.dto[a].getCarInsuranceDTO().getCarNumber().equals(carNumber)) {
				System.out.println(this.dto[a].getCarInsuranceDTO().getPlanDTO().getCompanyName());
				System.out.println("Found at the index " + a);
				return true;
			}
		}
		System.out.println("cannot find");
		return false;
	}

	@Override
	public boolean findRegisteredYearOfCar(String carNumber) {
		if (carNumber == null) {
			System.out.println("Do not pass null value");
			return false;
		}
		for (int a = 0; a < this.dto.length; a++) {
			if (this.dto[a] != null && this.dto[a].getCarInsuranceDTO().getCarNumber().equals(carNumber)) {
				System.out.println(this.dto[a].getCarInsuranceDTO().getRegisteredYear());
				System.out.println("Found at the index " + a);
				return true;
			}
		}
		System.out.println("Cannot find");
		return false;
	}

	@Override
	public boolean findbankByPhoneNumber(Long phoneNumber) {
		if (phoneNumber == null) {
			System.out.println("Do not pass null");
			return false;
		}

		for (int i = 0; i < this.dto.length; i++) {
			if (this.dto[i] != null && this.dto[i].getPhoneNumber().equals(phoneNumber)) {
				System.out.println(this.dto[i].getBankName());
				System.out.println("found at the index " + i);
				return true;
			}
		}
		System.out.println("cannot find");
		return false;
	}

	@Override
	public boolean findPlanOfcarInsuranceByCarNumber(String carNum) {
		if (carNum == null) {
			System.out.println("Do not pass null");
			return false;
		}

		for (int i = 0; i < this.dto.length; i++) {
			if (this.dto[i] != null && this.dto[i].getCarInsuranceDTO().getCarNumber().equals(carNum)) {
				System.out.println(this.dto[i].getCarInsuranceDTO().getPlanDTO().getCompanyName());
				System.out.println(this.dto[i].getCarInsuranceDTO().getPlanDTO().getInsurancePrice());
				System.out.println(this.dto[i].getCarInsuranceDTO().getPlanDTO().getYearCoverage());
				System.out.println("found at the index "+i);
				return true;
			}
		}
		System.out.println("Cannot find");
		return false;
	}

}
