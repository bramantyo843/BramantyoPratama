package com.juara.coding;


public class Account {
	Account account;
	int acc_no;
	String name;
	double amount;

	public String insert(int a, String n, double amt) {
		acc_no = a;
		name = n;
		amount = amt;

		return n;
	}

	public void deposit(double amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}

	public String withdraw(double amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
		return null;
	}

	public void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}

	public void checkBalance() {
		System.out.println("Balance is: " + amount);
	}
}