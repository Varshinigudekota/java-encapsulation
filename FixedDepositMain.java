package com.deposit;

public class FixedDepositMain {
		public static void main(String [] args)
		{
			FixedDepositAccount fixeddepositamount=new FixedDepositAccount("varshi", 25466, 23598, 1,2154);
			System.out.println(fixeddepositamount.calculateMaturityAmount());
			fixeddepositamount.withdrawBeforeMaturity(50);
		}
}

