package main;

public class s_acc extends account {
	public s_acc(int money) {
		super(money);
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
