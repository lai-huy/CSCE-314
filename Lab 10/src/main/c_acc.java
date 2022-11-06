package main;

public class c_acc extends account {
	public c_acc(double balance) {
		super(balance);
	}

	@Override
	public double get_min_balance() {
		return this.min_balanace;
	}

	@Override
	public void set_min_balanace(double balance) {
		this.min_balanace = balance;
	}
}
