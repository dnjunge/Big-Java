package bank;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * 
 *  @author Dan
 *
 */

public class BankAccount {
	
	// Instance fields
	private double balance;
	
	// Constructors
	
	/**
	 * Constructs a bank account with zero balance
	 */
	public BankAccount()
	{
		this.balance = 0;
		
		// or use "this(0);". this followed by parentheses denotes a call 
		// to another constructor of the same class
	}
	

	/**
	 * Constructs a bank account with a given balance
	 * @param initialBalance the initial balance
	 */
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
	}
	
	// Methods
	
	/**
	 * Deposits money into the bank account
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		double newBalance = this.balance + amount;
		this.balance = newBalance;
	}

	/**
	 * Withdraws money from the bank account
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		double newBalance = this.balance - amount;
		this.balance = newBalance;
	}
	
	/**
	 * Gets the current balance of the bank account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return this.balance;
	}
	
	/**
	 * Withdraws 10 from the account to service a monthly fee
	 */
	public void monthlyfee()
	{
		this.withdraw(10);
	}

}
