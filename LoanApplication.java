package com.encapsulation;

public class LoanApplication {
		private String customerName;
		private double loanAmount;
		private double interestRate;
		private int loanTerm;
		private double outstandingBalance;
		public LoanApplication(String customerName, double loanAmount, double interestRate, int loanTerm, double outstandingBalance )
		{
			this.customerName=customerName;
			this.loanAmount=loanAmount;
			this.interestRate=interestRate;
			this.loanTerm=loanTerm;
			this.outstandingBalance=outstandingBalance;
		}
		public String getcustomerName()
		{
			return customerName;
		}
		public void setcustomerName(String customerName)
		{
			this.customerName=customerName;
		}
		public double getloanAmount()
		{
			return loanAmount;
		}
		public void setloanAmount(double loanAmount)
		{
			this.loanAmount=loanAmount;
		}
		public double getinterestRate()
		{
			return interestRate;
		}
		public void setinterestRate(double interestRate)
		{
			this.interestRate=interestRate;
		}
		public int getloanTerm()
		{
			return loanTerm;
		}
		public void setloanTerm(int loanTerm)
		{
			this.loanTerm=loanTerm;
		}
		public double getoutstandingBalance()
		{
			return outstandingBalance;
		}
		public void setoutstandingBalance(double outstandingBalance)
		{
			this.outstandingBalance=outstandingBalance;
		}
		public void makePayment(double amount)
		{
			if(amount<=0)
			{
				System.out.println("invalid payment");
			}
			else
			{
				if(amount>this.getoutstandingBalance())
				{
					System.out.println("print exceeds loan" +this.outstandingBalance);
				}
				else {
					System.out.println("successfull");
				}
			}            
		}
		public double calculateEMI()
		{
			double monthrate=this.interestRate/(12*100);
			int months=this.loanTerm*12;
			if(monthrate==0)
			{
				return this.loanAmount/months;
				 
			}
			double emi=this.loanAmount*monthrate*Math.pow(1+monthrate, months)/Math.pow(1+monthrate, months);
			return Math.round(emi * 100.01)/100;
		}
		public void displayLoanDetails()
		{
			System.out.println("display total loan: " +loanAmount+ "\ninterest rate: " +interestRate+ "\nemi: "+this.calculateEMI()+ "\nremaining balance: " + outstandingBalance);
		}
}

