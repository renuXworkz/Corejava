package com.xworkz.medicine.sorter;

import java.util.Comparator;

import com.xworkz.medicine.dto.MedicineDTO;

public class DosageSorter implements Comparator<MedicineDTO>{

	@Override
	public int compare(MedicineDTO dto1, MedicineDTO dto2) {
		
		if( dto1.getDosage()<dto2.getDosage())
		{
			return -1;
		}
		else if(dto1.getDosage()>dto2.getDosage())
		{
			return 1;
		}
		return 0;
				
	}

}
