package com.xworkz.amazonpay.implementor;

import com.xworkz.amazonpay.interfaces.DebitCardPay;
import com.xworkz.amazonpay.interfaces.NetBankingPay;
import com.xworkz.amazonpay.interfaces.UPIPay;

public class DebitCardImple implements DebitCardPay,NetBankingPay,UPIPay {

	
	//overcome multiple inheritence
	@Override
	public void fillDebitCardDetails(int cvv, int expYear, int month) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillAccountHolderName(String holderName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payAmount(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillHolderName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillUPI(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillBankName(String bankName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int phoneNumber(long phoneNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fillOTP(int otp) {
		// TODO Auto-generated method stub
		
	}

}
