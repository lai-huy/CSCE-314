package main;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

abstract class account {
	protected static AtomicLong last_id = new AtomicLong();
	protected static final Random rand = new Random();
	protected long id;
	protected double balance;
	protected double min_balanace;

	public account(double balance) {
		long temp = Math.abs(rand.nextLong()) % Long.MAX_VALUE;
		while (temp == last_id.get())
			temp = Math.abs(rand.nextLong()) % Long.MAX_VALUE;
		this.id = temp;
		last_id.set(temp);
		this.balance = balance;
	}

	void credit(double money) {
		this.balance += money;
	}

	void debit(double money) {
		if (this.balance - money >= 500d)
			this.balance -= money;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "account [id=" + id + ", balance=" + balance + "]";
	}
	
	public abstract double get_min_balance();
	public abstract void set_min_balanace(double balance);
}
