package bank;

public class BankAccountTester {

	public static void main(String[] args) {

		BankAccount dansChecking = new BankAccount();
		
		dansChecking.deposit(2000);
		dansChecking.withdraw(500);
		System.out.println(dansChecking.getBalance());
		System.out.println("Expected: 1500");
		
		dansChecking.monthlyfee();
		System.out.println(dansChecking.getBalance());
		System.out.println("Expected: 1490");

	}

}
