package com.xworkz.interview.dao;

import java.util.Date;

import com.xworkz.interview.dto.InterviewDTO;

public class InterviewDAOImplementation extends InterviewDAO{

	private InterviewDTO[] dtos=new InterviewDTO[4];
	private int count=0;
	

	
	@Override
	public boolean save(InterviewDTO dto) {
		if(dto==null)
		{
			System.err.println("Do not pass null value,cannot store");
			return false;
		}
		boolean isFound=findDuplicate(dto);
		if(isFound)
		{
			System.err.println("Cannot pass Duplicate value");
			return false;
		}
		if(this.count<this.dtos.length)
		{
			this.dtos[this.count]=dto;
			
			System.out.println("successfully stored in array at the index "+this.count);
			this.count++;
			return true;
		}
		System.err.println("Array is full, cannot save");
		return false;
	}
	@Override
	public boolean findDuplicate(InterviewDTO dto) {
		if(dto==null)
		{
			System.err.println("do not pass null values");
			return false;
		}
		for(int start=0;start<this.dtos.length;start++)
		{
			if(dto.equals(this.dtos[start]))
			{
				System.out.println("Duplicate found");
				return true;
			}
		}
		System.err.println("Duplicate not found");
		return false;
	}
	@Override
	public boolean updateByDateOfInterview(Date date, InterviewDTO dto) {
		if(dto==null && date==null)
		{
			System.err.println("Do not pass null value.Cannot update");
			return false;
		}
		for(int i=0;i<this.dtos.length;i++)
		{
			if(this.dtos[i]!=null && this.dtos[i].getDate().equals(date))
			{
				this.dtos[i]=dto;
				System.out.println("successfully updated the dto at the index "+i);
				return true;
			}
		}
		System.err.println("Cannot update the dto");
		return false;
	}
	@Override
	public boolean findDateOfInterviewAndNameById(int id) {
		if(id<=0)
		{
			System.err.println("Invalid ID");
			return false;
		}
		for(int z=0;z<this.dtos.length;z++)
		{
			if(this.dtos[z]!=null && id==this.dtos[z].getId())
			{
				System.out.println(this.dtos[z].getCandidateName());
				System.out.println(this.dtos[z].getDate());
				return true;
			}
		}
		System.err.println("Cannot found the id");
		return false;
	}
	@Override
	public boolean deleteById(int id) {
		if(id<=0)
		{
			System.out.println("pass valid ID");
			return false;
		}
		for(int i=0;i<this.dtos.length;i++)
		{
			if(this.dtos[i]!=null && id==this.dtos[i].getId())
			{
				this.dtos[i]=null;
				System.out.println("deleted at the index "+i);
				return true;
			}
			
		}
		System.out.println("Cannot delete the dto ");
		return false;
	}
	
	
	
	
	
	
}
