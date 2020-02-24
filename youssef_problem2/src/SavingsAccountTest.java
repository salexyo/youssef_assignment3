public class SavingsAccountTest
{
	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		for (int i = 1; i <= 12; i++)
		{
			System.out.println("MONTH " + i + "| INTEREST: 0.04");
			System.out.println("Monthly balance for saver1: " + saver1.getSavingsBalance());
			System.out.println("Monthly interest gain for saver1: " + saver1.calculateMonthlyInterest());
			System.out.println("Monthly balance for saver1: " + saver2.getSavingsBalance());
			System.out.println("Monthly interest gain for saver1: " + saver2.calculateMonthlyInterest());
		}
		
		SavingsAccount.modifyInterestRate(0.05);
		System.out.println("MONTH " + 13 + "| INTEREST: 0.05");
		System.out.println("Monthly balance for saver1: " + saver1.getSavingsBalance());
		System.out.println("Monthly interest gain for saver1: " + saver1.calculateMonthlyInterest());
		System.out.println("Monthly balance for saver1: " + saver2.getSavingsBalance());
		System.out.println("Monthly interest gain for saver1: " + saver2.calculateMonthlyInterest());
		
	}
}
