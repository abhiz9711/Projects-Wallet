package com.cg.beans;

public class Wallet {
	private double balance;

	public Wallet(double amount) {
		this.balance = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return ", balance=" + balance;
	}

}
