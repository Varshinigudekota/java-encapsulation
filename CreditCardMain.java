package com.deposit;

import com.creditcard.CreditCardAccount;

public class CreditCardMain {
	public static void main(String [] args)
	{
	CreditCardAccount creditcardaccount=new CreditCardAccount("varshi", 1254,2563,2558);
	creditcardaccount.swipeCard(5);
	creditcardaccount.makePayment(8);
	creditcardaccount.applyInterest();
	}
}
