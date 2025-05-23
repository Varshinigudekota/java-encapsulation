package com.deposit;

public class FixedDepositAccount {
	private String customerName;
	private double principalAmount;
	private double interestRate;
	private int duration;
	private double maturityAmount;
	public FixedDepositAccount(String customerName, double principalAmount, double interestRate, int duration, double maturityAmount)
	{
		this.customerName=customerName;
		this.principalAmount=principalAmount;
		this.interestRate=interestRate;
		this.duration=duration;
		this.maturityAmount=maturityAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getMaturityAmount() {
		return maturityAmount;
	}
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	public double calculateMaturityAmount()
	{
		double rate=this.interestRate/100;
		double compundInterest=principalAmount*Math.pow(1+(rate/12), 12*this.duration);
		this.maturityAmount=compundInterest;
		return maturityAmount;
	}
	public void withdrawBeforeMaturity(int withdrawInMonths)
	{
		if(withdrawInMonths<12)
		{
			System.out.println("cannot withdraw before year");
		}
		else if(withdrawInMonths<this.duration*12)
		{
			double penalty=this.principalAmount*0.02;
			double withdrawAmount=this.maturityAmount-penalty;
			System.out.println("withdrawl happens before maturity penalty 2%");
			System.out.println("atfer penalty" +withdrawAmount);
		}
		else {
			System.out.println("withdraw after months" +withdrawInMonths);
		}
	}
}
