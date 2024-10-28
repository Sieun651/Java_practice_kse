
public class Bank {
	private String name;
	private double balance;
	private double rate;
	
	public Bank(String name, double balance, double rate) {
		//super(); //상속관련
		this.name = name;
		this.balance = balance;
		this.rate = rate;
	}
	
	public void print_account() {
		System.out.println(name + "\t" + balance + "원\t" + rate + "%");
	}
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	
	
}
