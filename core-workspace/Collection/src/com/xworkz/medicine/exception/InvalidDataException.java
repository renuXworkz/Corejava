package com.xworkz.medicine.exception;

public class InvalidDataException extends Exception{

	
	public InvalidDataException(String message) {
		System.out.println(message);
		System.out.println("Cannot save");
	}
}
