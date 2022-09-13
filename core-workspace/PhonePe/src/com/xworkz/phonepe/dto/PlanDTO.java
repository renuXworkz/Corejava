package com.xworkz.phonepe.dto;

import com.xworkz.phonepe.constants.InsuranceCompany;

public class PlanDTO {

	
	private InsuranceCompany companyName;
	private double insurancePrice;
	private int yearCoverage;
	 
	
	public PlanDTO() {
		System.out.println("default no-arg constrctor");
	}

	public PlanDTO(InsuranceCompany companyName, double insurancePrice, int yearCoverage) {
		super();
		this.companyName = companyName;
		this.insurancePrice = insurancePrice;
		this.yearCoverage = yearCoverage;
	}

	public InsuranceCompany getCompanyName() {
		return companyName;
	}

	public void setCompanyName(InsuranceCompany companyName) {
		this.companyName = companyName;
	}

	public double getInsurancePrice() {
		return insurancePrice;
	}

	public void setInsurancePrice(double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}

	public int getYearCoverage() {
		return yearCoverage;
	}

	public void setYearCoverage(int yearCoverage) {
		this.yearCoverage = yearCoverage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(insurancePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + yearCoverage;
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
		PlanDTO other = (PlanDTO) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (Double.doubleToLongBits(insurancePrice) != Double.doubleToLongBits(other.insurancePrice))
			return false;
		if (yearCoverage != other.yearCoverage)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlanDTO [companyName=" + companyName + ", insurancePrice=" + insurancePrice + ", yearCoverage="
				+ yearCoverage + "]";
	}
	
	
	
}
