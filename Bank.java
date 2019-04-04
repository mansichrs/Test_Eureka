package demo8;

interface BankRBI {
	void withdraw();
	void deposit();
	public default void adhaarlink() {
		System.out.println("default adhaar method");
	}
	public default void minBalance() {
		System.out.println("Min Balance: 1000");
	}
}

class SBI implements BankRBI {

	@Override
	public void withdraw() {
		System.out.println("SBI withdraw");
	}

	@Override
	public void deposit() {
		System.out.println("SBI deposit");
	}
	@Override 
	public void adhaarlink() {
		System.out.println("SBI adhaar linked");
	}
	
}
class Axis implements BankRBI {

	@Override
	public void withdraw() {
		System.out.println("Axis withdraw");
	}

	@Override
	public void deposit() {
		System.out.println("Axis deposit");
	}
	
}

class PNB implements BankRBI {

	@Override
	public void withdraw() {
		System.out.println("PNB withdraw");
	}

	@Override
	public void deposit() {
		System.out.println("PNB deposit");
	}
	
}

public class Bank {

	static {
		System.out.println("Static block");
	}
	public static void main(String... args) {
		BankRBI sbiUser = new SBI();
		sbiUser.deposit();
		sbiUser.withdraw();
		BankRBI axisUser = new Axis();
		axisUser.deposit();
		axisUser.withdraw();
		axisUser.adhaarlink();
		sbiUser.adhaarlink();
		System.out.println(args.toString());
	}

}
