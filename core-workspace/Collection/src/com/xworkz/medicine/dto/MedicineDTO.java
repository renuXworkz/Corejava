package com.xworkz.medicine.dto;

import java.io.Serializable;
import java.util.Comparator;

public class MedicineDTO implements Comparable<MedicineDTO>,Serializable{
	private String name;
	private String location;
	private int dosage;
	private int expYear;

	public MedicineDTO(String name, String location, int dosage, int expYear) {
		super();
		this.name = name;
		this.location = location;
		this.dosage = dosage;
		this.expYear = expYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dosage;
		result = prime * result + expYear;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicineDTO other = (MedicineDTO) obj;
		if (dosage != other.dosage)
			return false;
		if (expYear != other.expYear)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MedicineDTO [name=" + name + ", location=" + location + ", dosage=" + dosage + ", expYear=" + expYear
				+ "]";
	}

	
	@Override
	public int compareTo(MedicineDTO dto) {
		
		return this.name.compareTo(dto.getName());
	}

}
