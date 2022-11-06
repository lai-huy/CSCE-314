package main;

import java.util.ArrayList;
import java.util.List;

public class customer {
	private String name;
	private int ph_num;
	private String address;
	private final account account;
	private List<Double> Transactions;

	public customer(final String name, final int ph_num, final String address, final account account) {
		this.name = name;
		this.ph_num = ph_num;
		this.address = address;
		this.account = account;
		this.Transactions = new ArrayList<>();
	}

	public void credit(double money) {
		account.credit(money);
		this.Transactions.add(money);
	}

	public void debit(double money) {
		account.debit(money);
		this.Transactions.add(-1 * money);
	}

	public void print_transactions() {
		System.out.print(this.Transactions.toString());
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", ph_num=" + ph_num + ", address=" + address + ", account=" + account
				+ ", Transactions=" + Transactions + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public int getPh_num() {
		return ph_num;
	}
	
	public String getAddress() {
		return address;
	}
	
	public account getAccount() {
		return account;
	}
	
	public List<Double> getTransactions() {
		return Transactions;
	}
}
