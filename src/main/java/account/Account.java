package account;

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		super();
	}

	public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterstRate(){
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	public double withdraw(double withdrawl){
		balance -= withdrawl;
		return withdrawl;
	}
	
	public double deposit(double deposit){
		balance += deposit;
		return deposit;
	}
	
}
