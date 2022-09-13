package com.xworkz.amazonpay.implementor;

import com.xworkz.amazonpay.interfaces.DebitCardPay;
import com.xworkz.amazonpay.interfaces.NetBankingPay;
import com.xworkz.amazonpay.interfaces.UPIPay;

public class AmazonPayImplementor implements UPIPay,DebitCardPay,NetBankingPay{ 

	@Override
	public void fillHolderName(String name) {
		System.out.println("user name is "+name);
		
	}

	@Override
	public void fillUPI(String id) {
		System.out.println("UPI is "+id);
		
	}

	@Override
	public void payAmount(double price) {
		System.out.println("Succssfully paid the amount "+price);
		
	}

	@Override
	public void fillDebitCardDetails(int cvv, int expYear, int month) {
		System.out.println("CVV is "+cvv);
		System.out.println("Expiry Date is "+expYear);
		System.out.println("Month  "+month);
		
	}

	@Override
	public void fillAccountHolderName(String holderName) {
		System.out.println("Holder Name is "+holderName);
		
	}

	@Override
	public void fillBankName(String bankName) {
		System.out.println("Bank Name is "+bankName);
		
	}

	@Override
	public int phoneNumber(long phoneNumber) {
		System.out.println("Phone Number is "+phoneNumber);
		
		int otp=(int)(Math.random()*(400-200+1+200));
		
		return otp;
	}

	@Override
	public void fillOTP(int otp) {
		System.out.println("otp is "+otp);
		
	}

}
