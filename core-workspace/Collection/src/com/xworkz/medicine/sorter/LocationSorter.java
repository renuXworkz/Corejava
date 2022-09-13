package com.xworkz.medicine.sorter;

import java.util.Comparator;

import com.xworkz.medicine.dto.MedicineDTO;

public class LocationSorter implements Comparator<MedicineDTO>{

	@Override
	public int compare(MedicineDTO dto1, MedicineDTO dto2) {
		System.out.println("Overriding");
		return dto1.getLocation().compareTo(dto2.getLocation());
	}

}
