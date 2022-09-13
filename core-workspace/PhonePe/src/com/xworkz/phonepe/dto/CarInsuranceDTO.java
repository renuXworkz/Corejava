package com.xworkz.phonepe.dto;

public class CarInsuranceDTO {

	private String carNumber;
	private String carName;
	private String model;
	private int registeredYear;
	private PlanDTO planDTO;
	
	public CarInsuranceDTO() {
		System.out.println("default no-arg constructor");
	}

	public CarInsuranceDTO(String carNumber, String carName,String model, int registeredYear, PlanDTO planDTO) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
		this.model=model;
		this.registeredYear = registeredYear;
		this.planDTO = planDTO;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRegisteredYear() {
		return registeredYear;
	}

	public void setRegisteredYear(int registeredYear) {
		this.registeredYear = registeredYear;
	}

	public PlanDTO getPlanDTO() {
		return planDTO;
	}

	public void setPlanDTO(PlanDTO planDTO) {
		this.planDTO = planDTO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((carNumber == null) ? 0 : carNumber.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((planDTO == null) ? 0 : planDTO.hashCode());
		result = prime * result + registeredYear;
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
		CarInsuranceDTO other = (CarInsuranceDTO) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carNumber == null) {
			if (other.carNumber != null)
				return false;
		} else if (!carNumber.equals(other.carNumber))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (planDTO == null) {
			if (other.planDTO != null)
				return false;
		} else if (!planDTO.equals(other.planDTO))
			return false;
		if (registeredYear != other.registeredYear)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarInsuranceDTO [carNumber=" + carNumber + ", carName=" + carName + ", model=" + model
				+ ", registeredYear=" + registeredYear + ", planDTO=" + planDTO + "]";
	}
	
	
}
