//program to understand advanced collection
package com.collection; //package

import java.io.Serializable;

public class SavingAccount implements Serializable{

	private static final long serialVersionUID = -4553930616944692146L;

	@Override
	public int hashCode() { // hash code and equals method
		final int prime = 31;
		int result = 1;
		result = prime * result + acc_ID;
		long temp;
		temp = Double.doubleToLongBits(acc_balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountHoldername == null) ? 0 : accountHoldername.hashCode());
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (acc_ID != other.acc_ID)
			return false;
		if (Double.doubleToLongBits(acc_balance) != Double.doubleToLongBits(other.acc_balance))
			return false;
		if (accountHoldername == null) {
			if (other.accountHoldername != null)
				return false;
		} else if (!accountHoldername.equals(other.accountHoldername))
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	private double acc_balance;
	private int acc_ID; // instance member
	private String accountHoldername;
	private boolean isSalaryAccount;

	public SavingAccount(double acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername; // constructor
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) { // getter and setter
		this.accountHoldername = accountHoldername;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public double withdraw(double amount) {
		return acc_balance;
	}

	public double deposit(double amount) {
		return acc_balance;
	}

	@Override
	public String toString() { // to string method
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
}
