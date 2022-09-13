package com.xworkz.interview.dto;

import java.io.Serializable;
import java.util.Date;

public class InterviewDTO implements Serializable,Cloneable{
	private int id;
	private String companyName;
	private String candidateName;
	private int interviewHour;
	private String designation;
	private Date date;

	
	public InterviewDTO() {
		System.out.println("Default o arg constructor");
	}


	public InterviewDTO(int id, String companyName, String candidateName, int interviewHour,String designation,Date date) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.candidateName = candidateName;
		
		this.interviewHour = interviewHour;
		this.designation=designation;
		this.date=date;
		
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCandidateName() {
		return candidateName;
	}


	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}


	



	public int getInterviewHour() {
		return interviewHour;
	}


	public void setInterviewHour(int interviewHour) {
		this.interviewHour = interviewHour;
	}


	@Override
	public String toString() {
		return "InterviewDTO [id=" + id + ", companyName=" + companyName + ", candidateName=" + candidateName
				 + ", interviewHour=" + interviewHour + ", designation="
				+ designation + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + id;
		
		result = prime * result + interviewHour;
		
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
		InterviewDTO other = (InterviewDTO) obj;
		if (candidateName == null) {
			if (other.candidateName != null)
				return false;
		} else if (!candidateName.equals(other.candidateName))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id != other.id)
			return false;
		
		if (interviewHour != other.interviewHour)
			return false;
		
		return true;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}