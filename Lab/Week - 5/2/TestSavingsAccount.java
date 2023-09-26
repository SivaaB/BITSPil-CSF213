import java.util.Scanner; 

class SavingsAccount 
{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) 
    {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() 
    {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) 
    {
        annualInterestRate = newInterestRate;
    }

    public double getSavingsBalance() 
    {
        return savingsBalance;
    }
}

public class TestSavingsAccount 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial savings balance for Account - 1 : ");
        double initialBalance1 = scanner.nextDouble();
        System.out.print("Enter initial savings balance for Account - 2 : ");
        double initialBalance2 = scanner.nextDouble();
        System.out.print("Enter initial savings balance for Account - 3 : ");
        double initialBalance3 = scanner.nextDouble();

        SavingsAccount[] accounts = new SavingsAccount[3];
        accounts[0] = new SavingsAccount(initialBalance1);
        accounts[1] = new SavingsAccount(initialBalance2);
        accounts[2] = new SavingsAccount(initialBalance3);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Month 1:");
        for (int i = 0; i < accounts.length; i++) 
        {
            accounts[i].calculateMonthlyInterest();
            System.out.println("Account - " + (i + 1) + " Balance: " + accounts[i].getSavingsBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("\nMonth 2:");
        for (int i = 0; i < accounts.length; i++) 
        {
            accounts[i].calculateMonthlyInterest();
            System.out.println("Account " + (i + 1) + " Balance: " + accounts[i].getSavingsBalance());
        }
    }
}
