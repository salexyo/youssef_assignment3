
public class SavingsAccount
{
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
	
	public double getSavingsBalance()
	{
		return this.savingsBalance;
	}
	
	public double calculateMonthlyInterest()
	{
		double monthlyInterest = this.savingsBalance * (annualInterestRate / 12);
		this.savingsBalance += monthlyInterest;
		return monthlyInterest;
	}
	
	public static void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
	}
}
