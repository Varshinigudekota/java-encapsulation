package com.creditcard;

public class CreditCardAccount {
	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double interestRate;
	
	public CreditCardAccount(String customerName, double creditLimit, double currentDebt, double interestRate)
	{
		this.customerName=customerName;
		this.creditLimit=creditLimit;
		this.currentDebt=currentDebt;
		this.interestRate=interestRate;	
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditcardLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getCurrentDebt() {
		return currentDebt;
	}

	public void setCurrentDebt(double currentDebt) {
		this.currentDebt = currentDebt;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void swipeCard(double amount)
	{
		if(amount>this.creditLimit) {
			System.out.println("Transaction declined: Limit exceeded");
		}
		else {
			System.out.println("increase currentDebt");
		}
	}
	public void makePayment(double amount)
	{
		if(amount<this.currentDebt)
		{
			System.out.println("Excess payment not allowed");
		}
	}
	public void applyInterest()
	{
		this.currentDebt+=(this.currentDebt*(this.interestRate/100.0));
		System.out.println(this.currentDebt);
	}
}
