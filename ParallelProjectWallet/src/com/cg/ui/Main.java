package com.cg.ui;

import java.util.Scanner;

import com.cg.beans.Customer;
import com.cg.exception.InvalidException;
import com.cg.service.WalletService;
import com.cg.service.WalletServiceImpl;

public class Main {
	private static Scanner sc;
	static Customer c = new Customer();
	static WalletService service = new WalletServiceImpl();
	
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		int ch;
		do {
			System.out
					.println("*******************MOBILE WALLET******************");
			System.out.println("Enter your choice");
			System.out.println("1.Create Account");
			System.out.println("2.Show Balance");
			System.out.println("3.Withdraw");
			System.out.println("4.Deposit Amount");
			System.out.println("5.FundTransfer");
			System.out.println("6.Exit");
			System.out.println("Enter ur choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				addAccount();
				break;
			case 2:
				showBal();
				break;

			case 3:
				withdraw();
				break;

			case 4:
				deposit();
				break;

			case 5:
				fundTransfer();
				break;

			case 6:
				System.out.println("Thank You!!!!!!");
				break;
			}

		} while (ch != 6);

	}

	private static void fundTransfer() {
		// TODO Auto-generated method stub
		String mob1;
		String mob2;
		
		do {
			try {
				System.out.println("Enter mobile number which has be registered");
				mob1 = sc.next();
				if (service.validateNumber(mob1)
						&& !service.isAvailableMobile(mob1))
					break;
			} catch (InvalidException e) {
				System.out.println("Sender " + e.getMessage());
			}
		} while (true);

		do {
			try {
				System.out
						.println("Enter mobile number of the receiver stored in coll");
				mob2 = sc.next();
				if (service.validateNumber(mob2)
						&& !service.isAvailableMobile(mob2))
					break;
			} catch (InvalidException e) {
				System.out.println("Receiver " + e.getMessage());
			}
		} while (true);
		do {
			System.out.println("Enter amount you want to transfer");
			double amount = sc.nextDouble();
			try {
				c = service.fundTransfer(mob1, mob2, amount);
				break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		if (c != null) {
			System.out.println("Transfered amount successfully");
			System.out.println(""
					+ c.getName() + " with mobile number "
					+ c.getMobileNo() + " Available balance in account:"
					+ c.getWallet().getBalance());
		} else
			System.out.println("Transfer failed");

		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		 String mobi;
		 double amt;

		do {
			try {
				System.out
						.println("Enter the mobile number that you registered for the account");
				mobi = sc.next();
				if (service.validateNumber(mobi)
						&& !service.isAvailableMobile(mobi))
					break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		do {
			try {
				System.out
						.println("Enter the amount you want to deposit");
				amt = sc.nextDouble();
				c = service.depositAmount(mobi, amt);
				System.out.println("!!!!Deposit Sucessfull!!!!");
				System.out.println("Hiii " + c.getName()
						+ " Your Available Balance: "
						+ c.getWallet().getBalance());
				break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}

		} while (true);


	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		String mobil;
		double amt1;

		do {
			try {
				System.out
						.println("Enter the mobile number that you registered for the account");
				mobil = sc.next();
				if (service.validateNumber(mobil)
						&& !service.isAvailableMobile(mobil))
					break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		do {
			try {
				System.out
						.println("Enter the amount you want to withdraw");
				amt1 = sc.nextDouble();
				c = service.withdrawAmount(mobil, amt1);
				System.out.println("!!!!Withdraw Sucessfull!!!!");
				System.out.println("Hii " + c.getName()
						+ "Your Available Balance: "
						+ c.getWallet().getBalance());
				break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}

		} while (true);

		
	}

	private static void showBal() {
		// TODO Auto-generated method stub
		do {
			System.out.println("Enter mobile number");
			String mobile = sc.next();
			try {
				if (service.validateNumber(mobile)) {
					c = service.showBalance(mobile);
					break;
				}
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		System.out.println("Hiii " + c.getName()
				+ " Your Available Balance: "
				+ c.getWallet().getBalance());
	
		
	}

	private static void addAccount() {
		// TODO Auto-generated method stubString name;
		String mob;
		double bal;
		String name;
		do {
			System.out.println("Enter name");
			name = sc.next();
			try {
				if (service.validateName(name))
					break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		do {
			try {
				System.out.println("Enter mobile number");
				mob = sc.next();
				if (service.validateNumber(mob)
						&& !service.isNewMobile(mob))
					break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		do {
			try {
				System.out.println("Enter intial balance");
				bal = sc.nextDouble();
				if (service.validateBalance(bal))
					break;
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		c = service.createAccount(name, mob, bal);
		System.out
				.println("!!!!Account has been Sucessfully created!!!!");
		System.out.println(" Hiii " + c.getName() + "\n Your Mob.No: "
				+ c.getMobileNo() + "\n Available Balance: "
				+ c.getWallet().getBalance());
	}
}
