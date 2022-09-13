package com.xworkz.medicine.services;

import java.util.Date;
import java.util.List;

import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dto.MedicineDTO;
import com.xworkz.medicine.exception.InvalidDataException;

public class MedicineServicesImp implements MedicineServices {
	private MedicineDAO dao;

	public MedicineServicesImp(MedicineDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validate(MedicineDTO dto) throws InvalidDataException {
		if (dto != null) {
			if (dto.getName() == null || dto.getName().isEmpty() || dto.getName().length() < 3) {
				throw new InvalidDataException("Medicine name is not valid");
			}
			if (dto.getLocation() == null || dto.getLocation().isEmpty() || dto.getLocation().length() < 3) {
				throw new InvalidDataException("Medicine location is not valid");
			}
			if (dto.getDosage() < 0 || dto.getDosage() > 1000) {
				throw new InvalidDataException("Medicine dosage is not valid");
			}
			if (dto.getExpYear() < new Date().getYear() + 1900) {
				throw new InvalidDataException("Medicine expiry year is not valid");
			}
			System.out.println("dto is validated");
			return true;

		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean save(MedicineDTO dto) throws InvalidDataException {
		if (dto != null) {

			if (validate(dto)) {
				if (dao.save(dto)) {
					System.out.println(dto.toString());
					return true;
				}
			}
		}
		System.out.println("cannot save");
		return false;
	}

	@Override
	public boolean update(int dosage, MedicineDTO dto) throws InvalidDataException {
		if (dto != null) {

			if (validate(dto)) {
				if (dao.updateByDosage(dosage, dto)) {
					System.out.println(dto.toString());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public List<MedicineDTO> findAllMedicine() {
		dao.findAllMedicine();

		return null;
	}

	@Override
	public List<MedicineDTO> sortByDosage() {
		dao.sortByDosage();
		return null;
	}

	@Override
	public List<MedicineDTO> sortByLocation() {
		dao.sortByLocation();
		return null;
	}

	@Override
	public boolean deleteByDosage(int dosage) {
		dao.delete(dosage);
		return false;
	}

	@Override
	public List<MedicineDTO> findDTOByName(String name) {
		dao.findDTOByName(name);
		return null;
	}

}
