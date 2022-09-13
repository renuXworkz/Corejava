package com.xworkz.interview.dao;

import java.util.Date;

import com.xworkz.interview.dto.InterviewDTO;

public abstract class InterviewDAO {

	public abstract boolean save(InterviewDTO dto);
	public abstract boolean findDuplicate(InterviewDTO dto);
	public abstract boolean updateByDateOfInterview(Date date,InterviewDTO dto);
	public abstract boolean findDateOfInterviewAndNameById(int id);
	public abstract boolean deleteById(int id);
}
