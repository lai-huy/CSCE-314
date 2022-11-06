package main;

public class baank {
	private customer c1;
	private customer c2;
	
	public baank(final customer c1, final customer c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public void displayTransactions(int c) {
		switch (c) {
		case 1:
			c1.print_transactions();
			break;
		case 2:
			c2.print_transactions();
		}
	}
}
