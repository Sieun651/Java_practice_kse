
public class BankStatic {
	private String name;
	private double balance;
	private static double rate;	// 변동금리를 저장하는 변수
	
	public BankStatic(String name, double balance) {	//멤버함수 안에서는 static변수 사용가능
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public void print_account() {
		System.out.println(name + "\t" + balance + "원\t" + BankStatic.rate + "%");
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

	public static double getRate() {			//멤버함수아님
		return rate;
	}

	public static void setRate(double rate) {	//멤버함수아님
		BankStatic.rate = rate;
	}	
}
