

class SavingsAccount
{
    static double annualInterestRate;
    private double savingsBalance;
    void Account(double bal)
    {
        savingsBalance=bal;
    }
    double calculateMonthlyInterest()
    {
        double interest;
        interest=savingsBalance*(annualInterestRate/12);
        savingsBalance=savingsBalance+interest;
        return interest;
    }
    static void modifyInterestRate(double newintrate)
    {
        annualInterestRate=newintrate;
    }
    double getbalance(){
        
        return savingsBalance;
    }
}
public class SavingsAccount3
{
	public static void main(String[] args) {
	    SavingsAccount saver1=new SavingsAccount();
	    SavingsAccount saver2=new SavingsAccount();
	    saver1.Account(2000);
	    saver2.Account(3000);
	   	SavingsAccount.modifyInterestRate(0.04);
	    saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
		System.out.println("Balance of saver1 is: "+saver1.getbalance());
		System.out.println("Balance of saver2 is: "+saver2.getbalance());
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
		System.out.println("Balance of saver1 is: "+saver1.getbalance());
		System.out.println("Balance of saver2 is: "+saver2.getbalance());
	}
}