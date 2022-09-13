package com.xworkz.amazonpay;

import com.xworkz.amazonpay.implementor.AmazonPayImplementor;
import com.xworkz.amazonpay.implementor.DebitCardImple;
import com.xworkz.amazonpay.interfaces.DebitCardPay;
import com.xworkz.amazonpay.interfaces.NetBankingPay;
import com.xworkz.amazonpay.interfaces.UPIPay;

public class AmazonPayRunner {

	public static void main(String[] args) {
	/*	
		UPIPay upi=new AmazonPayImplementor();
		upi.fillHolderName("renu");
		upi.fillUPI("938366@upi");
		upi.payAmount(2987.98);
		
		
		DebitCardPay debitCard=new AmazonPayImplementor();
		debitCard.fillDebitCardDetails(2635, 2023, 7);
		debitCard.fillAccountHolderName("renu");
		debitCard.payAmount(7363.9);
		
		
		NetBankingPay netBank=new AmazonPayImplementor();
		netBank.fillBankName("SBI");
		int otp=netBank.phoneNumber(9484736383L);
		netBank.fillOTP(otp);
		netBank.payAmount(3873.87);
		
		*/
		
		
	DebitCardPay card=new DebitCardImple();	
	card.payAmount(4636);
	
	
	NetBankingPay netbank=new DebitCardImple();
	netbank.fillBankName("sbi");
		

	}

}
