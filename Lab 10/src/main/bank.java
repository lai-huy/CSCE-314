package main;

import java.util.ArrayList;
import java.util.Random;

public class bank {
	enum account_type {
		SAVINGS, CHECKING
	}

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 100; ++i) {
			account a = rand.nextBoolean() ? new c_acc(rand.nextInt(Integer.MAX_VALUE))
					: new s_acc(rand.nextInt(Integer.MAX_VALUE));
			System.out.println(a.toString());
		}

		ArrayList<customer> bank = new ArrayList<>();
		customer gw = new customer("George Washington", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		customer ja = new customer("John Adams", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		customer tj = new customer("Thomas Jefferson", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		customer jm = new customer("James Madison", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		customer jm2 = new customer("James Monroe", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		customer mvn = new customer("Martin van Buren", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		customer al = new customer("Abraham Lincoln", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		bank.add(gw);
		bank.add(ja);
		bank.add(tj);
		bank.add(jm);
		bank.add(jm2);
		bank.add(mvn);
		bank.add(al);

		for (final customer c : bank) {
			c.credit(rand.nextInt(2000));
			c.debit(rand.nextInt(1500));
			System.out.println(c.getName());
			System.out.println(c.getAddress());
			System.out.println(c.getAccount().toString());
			c.print_transactions();
			System.out.println("\n\n");
		}
		System.out.println("\n\n\n\n");

		// create two customers to demonstrate your work here
		customer jfk = new customer("John Kennedy", 2024561111, "1600 Pennsylvania Avenue NW, Washington, DC 20500",
				new s_acc(0));
		customer fdr = new customer("Franklin D Roosevelt", 2024561111,
				"1600 Pennsylvania Avenue NW, Washington, DC 20500", new c_acc(0));
		baank bank1 = new baank(jfk, fdr);

		for (int i = 0; i < rand.nextInt(10); ++i) {
			jfk.credit(rand.nextInt(Integer.MAX_VALUE));
			jfk.debit(rand.nextInt(Integer.MAX_VALUE / 2));
		}

		for (int i = 0; i < rand.nextInt(10); ++i) {
			fdr.credit(rand.nextInt(Integer.MAX_VALUE));
			fdr.debit(rand.nextInt(Integer.MAX_VALUE / 2));
		}

		System.out.println(jfk.toString());
		bank1.displayTransactions(1);
		System.out.println("\n");
		System.out.println(fdr.toString());
		bank1.displayTransactions(2);
		System.out.println("\n\n\n\n");

		create_account(10);
		System.out.println("\n");
		create_account(3, account_type.CHECKING);
		System.out.println("\n");
	}

	/*
	 * create overloaded create_accounts method with correct function signatures //
	 * Note: you can use the enum provided above or String or integer to identify
	 * the account type. Please add what you have used in the comments { create
	 * customers with random attribute and store them in array Note: Since this is a
	 * learning exercise the customers can have the same attributes }
	 */
	public static void create_account(int n) {
		create_account(n, account_type.SAVINGS);
	}

	public static void create_account(int n, account_type type) {
		ArrayList<account> bank = new ArrayList<account>();
		for (int i = 0; i < n; ++i) {
			switch (type) {
			case SAVINGS:
				bank.add(new s_acc(0));
				break;
			case CHECKING:
				bank.add(new c_acc(0));
				break;
			}
		}
		
		for (final account a : bank) {
			System.out.println(a.toString());
		}
	}
}
