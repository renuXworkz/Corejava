package com.xworkz.medicine.dao;

import java.util.*;
import com.xworkz.medicine.dto.MedicineDTO;
import com.xworkz.medicine.sorter.DosageSorter;
import com.xworkz.medicine.sorter.LocationSorter;

public class MedicineDAOImp implements MedicineDAO {

	List<MedicineDTO> list = new LinkedList<MedicineDTO>();
	DosageSorter dosageSort=new DosageSorter();
	LocationSorter locationSorter=new LocationSorter();

	@Override
	public boolean save(MedicineDTO dto) {

		if (dto != null) {
			if (findDuplicate(dto)) {
				System.out.println("Cannot add duplicate dto");
				return false;
			}
			list.add(dto);
			System.out.println("Successfully added dto");
			return true;
		}
		System.out.println("Cannot add null values");
		return true;
	}

	@Override
	public boolean findDuplicate(MedicineDTO dto) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)!=null && list.get(i).equals(dto)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateByDosage(int dosage, MedicineDTO dto) {
		if (dto != null) {
			if (findDuplicate(dto)) {
				System.out.println("Cannot add duplicate dto");
				return false;
			}
			Iterator<MedicineDTO> iterate = list.iterator();

			while (iterate.hasNext()) {
				MedicineDTO medicineDTO = iterate.next();
				if (medicineDTO!=null && medicineDTO.getDosage() == dosage) {

					int index = list.indexOf(medicineDTO);
					list.set(index, dto);
					
					System.out.println("Updated successfully");
					return true;
				}

			}

			System.out.println("cant find Dosage ,Cannot update");
			return false;
		}

		return false;

	}

	@Override
	public List<MedicineDTO> findAllMedicine() {
		if(!list.isEmpty())
		{
			for( MedicineDTO medicine:list)
			{
				System.out.println(medicine);
			}
		}
		return null;
	}

	@Override
	public List<MedicineDTO> sortByDosage() {
		if(!list.isEmpty())
		{
			list.sort(dosageSort);
			System.out.println("Sorted By Dosage");
			findAllMedicine();
			return list;
		}
		return null;
	}

	@Override
	public List<MedicineDTO> sortByLocation() {
		if(!list.isEmpty())
		{
			list.sort(locationSorter);
			System.out.println();
			System.out.println("Sorted By Location");
			findAllMedicine();
			return list;
		}
		return null;
	}

	@Override
	public boolean delete(int dosage) {
		Iterator<MedicineDTO> iterateDTO=list.iterator();
		while(iterateDTO.hasNext())
		{
			MedicineDTO dto=iterateDTO.next();
			if(dto!=null && dto.getDosage()==dosage)
			{
				list.remove(dto);
				System.out.println("Successfully deleted dto ");
				return true;
			}
		}
		return false;
	}

	@Override
	public MedicineDTO findDTOByName(String name) {
		if(name!=null)
		{
			Iterator<MedicineDTO> medicine=list.iterator();
			while(medicine.hasNext())
			{
				MedicineDTO dto=medicine.next();
				if(dto!=null && dto.getName().equals(name))
				{
					System.out.println("Found dto");
					return dto;
				}
			}
		}
		System.out.println("should not pass null or cannot find name");
		return null;
	}

	
}
