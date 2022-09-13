package com.xworkz.pharmacy.dao;

import com.xworkz.pharmacy.dto.PharmacyDTO;
import com.xworkz.pharmacy.exception.ArrayFullException;

public class PharmacyDAOImplementation extends PharmacyDAO {

	private PharmacyDTO[] dtos = new PharmacyDTO[3];
	private int counter = 0;

	@Override
	public boolean save(PharmacyDTO dto) throws ArrayFullException {
		if (dto != null) {

			if (this.counter < this.dtos.length) {
				this.dtos[this.counter] = dto;
				System.out.println("successfully added dto at the index " + this.counter);
				this.counter++;
				return true;
			} else {
				throw new ArrayFullException("Array is full , cannot add");
			}
		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean update(String name, PharmacyDTO dto) {
		if (dto != null) {
			for (int i = 0; i < this.dtos.length; i++) {
				if (this.dtos[i] != null && this.dtos[i].getName().endsWith(name)) {
					this.dtos[i] = dto;
					System.out.println("Successfully updated at the index " + this.counter);
					return true;
				}
			}
		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean findByMedicineName(String name) {
		if (name != null) {
			for (int i = 0; i < this.dtos.length; i++) {
				if (this.dtos[i] != null && this.dtos[i].getMedicineDTO().getName().equals(name)) {
					System.out.println("Medicine Name ->"+this.dtos[i].getMedicineDTO().getName());
					System.out.println("Dosage ->"+this.dtos[i].getMedicineDTO().getDosage());
					System.out.println("Expiry Year ->"+this.dtos[i].getMedicineDTO().getExpiryYear());
					System.out.println("Pharmacy Name ->"+this.dtos[i].getName());
					System.out.println("Pharmacy Location ->"+this.dtos[i].getPlace());
				}
			}
		}
		return false;
	}

}
