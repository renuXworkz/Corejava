package com.xworkz.pharmacy.dto;

public class MedicineDTO {

	
	private String name;
	private String dosage;
	private int expiryYear;
	public MedicineDTO() {
		System.out.println("Default no-arg constrctor");
	}
	public MedicineDTO(String name, String dosage, int expiryYear) {
		super();
		this.name = name;
		this.dosage = dosage;
		this.expiryYear = expiryYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dosage == null) ? 0 : dosage.hashCode());
		result = prime * result + expiryYear;
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
		if (dosage == null) {
			if (other.dosage != null)
				return false;
		} else if (!dosage.equals(other.dosage))
			return false;
		if (expiryYear != other.expiryYear)
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
		return "MedicineDTO [name=" + name + ", dosage=" + dosage + ", expiryYear=" + expiryYear + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
