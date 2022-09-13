package com.xworkz.pharmacy.dto;

import java.io.Serializable;

public class PharmacyDTO implements Serializable,Cloneable{

	private String name;
	private String place;
	private int gst;
	private boolean license;
	private MedicineDTO medicineDTO;
	
	public PharmacyDTO() {
		System.out.print(this.getClass().getName());
		System.out.println("Default no -arg constrctor");
		System.out.println(getClass());
		
	}

	public PharmacyDTO(String name, String place, int gst, boolean license, MedicineDTO medicineDTO) {
		
		this.name = name;
		this.place = place;
		this.gst = gst;
		this.license = license;
		this.medicineDTO = medicineDTO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public MedicineDTO getMedicineDTO() {
		return medicineDTO;
	}

	public void setMedicineDTO(MedicineDTO medicineDTO) {
		this.medicineDTO = medicineDTO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gst;
		result = prime * result + (license ? 1231 : 1237);
		result = prime * result + ((medicineDTO == null) ? 0 : medicineDTO.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
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
		PharmacyDTO other = (PharmacyDTO) obj;
		if (gst != other.gst)
			return false;
		if (license != other.license)
			return false;
		if (medicineDTO == null) {
			if (other.medicineDTO != null)
				return false;
		} else if (!medicineDTO.equals(other.medicineDTO))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PharmacyDTO [name=" + name + ", place=" + place + ", gst=" + gst + ", license=" + license
				+ ", medicineDTO=" + medicineDTO + ", getName()=" + getName() + ", getPlace()=" + getPlace()
				+ ", getGst()=" + getGst() + ", isLicense()=" + isLicense() + ", getMedicineDTO()=" + getMedicineDTO()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
