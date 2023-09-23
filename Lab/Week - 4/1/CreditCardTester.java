import java.util.Scanner;

class CreditCard
{
    Scanner sc = new Scanner(System.in);

    private String n, cn;
    private boolean en;
    private int p;
    private String em;
    private int ct, cuc;
    int cl;

    public CreditCard (String name, String cardNo, boolean enabled, int pin, String expiryMonth, int cardType, int currentCredit, int creditLimit)
    {
        n = name;
        cn = cardNo;
        en = enabled;
        p = pin;
        em = expiryMonth;
        ct = cardType;
        cuc = currentCredit;
        cl = creditLimit;
    }

    public void display()
    {
        System.out.println ("*******************");
        System.out.println (n);
        System.out.println (cn);
        System.out.println (en);
        // System.out.println (p); // ... do NOT display the PIN
        System.out.println (em);
        System.out.println (ct);
        System.out.println (cuc);
        System.out.println (cl);
    }

    public void changePin(int newPin)
    {
        System.out.println ("Old Pin was: " + p);
        p = newPin;
        System.out.println ("New Pin is:  " + p);
    }

    public void transact(int transact_amt)
    {
        if (en)
        {
            System.out.println ("Enter PIN: ");
            int pin_check = sc.nextInt();

            if (p == pin_check)
            {
                if (transact_amt <= cl)
                {
                    System.out.println ("Amount Before Transaction : " + cuc);
                    if (ct == 1)
                    {
                        cuc -= (int)(transact_amt*0.99);
                    }

                    else if (ct == 2)
                    {
                        cuc -= (int)(transact_amt*0.98);
                    }

                    else if (ct == 3)
                    {
                        cuc -= (int)(transact_amt*0.97);
                    }

                    else
                    {
                        cuc -= transact_amt;
                    }
                    System.out.println ("Amount After Transaction : " + cuc);

                }
                else
                {
                    System.out.println ("Transaction has exceeded the Credit Limit!");
                }
            }

            else
            {
                System.out.println ("Incorrect PIN!");
            }
        }

        else
        {
            System.out.println ("Card not yet enabled!");
        }
    }

    public void changeCardStatus(boolean status)
    {
        System.out.println ("Status Before: " + en);
        en = status;
        System.out.println ("Status Now: " + en);
    }

}

public class CreditCardTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println ("Enter Card Number: ");
        String cardNo = scanner.nextLine();
        System.out.println ("Enter Status [Enabled / Not Enabled]: ");
        boolean enabled = scanner.nextBoolean();
        System.out.println ("Enter Pin: ");
        int pin = scanner.nextInt();
        scanner.nextLine(); // To consume the newline after nextInt
        System.out.println ("Expiry Month: ");
        String expiryMonth = scanner.nextLine();
        System.out.println ("Card Type: ");
        int cardType = scanner.nextInt();
        System.out.println ("Current Credit: ");
        int currentCredit = scanner.nextInt();
        System.out.println ("Current Limit: ");
        int creditLimit = scanner.nextInt();

        CreditCard sivaa = new CreditCard (name, cardNo, enabled, pin, expiryMonth, cardType, currentCredit, creditLimit);

        for (int i = 0; i < 5; i++)
        {
            System.out.println ("1. Change Pin");
            System.out.println ("2. Transaction");
            System.out.println ("3. Change Card Status");
            System.out.println ("4. Display Details");
            int choice = scanner.nextInt();

            if (choice == 1)
            {
                System.out.println ("Enter New Pin: ");
                int n = scanner.nextInt();
                sivaa.changePin(n);
            }
            else if (choice == 2)
            {
                System.out.println ("Enter Amount: ");
                int amt = scanner.nextInt();
                sivaa.transact(amt);

            }
            else if(choice == 3)
            {
                System.out.println ("Enter Status [True/False]: ");
                boolean stat = scanner.nextBoolean();
                sivaa.changeCardStatus(stat);
            }
            else if (choice == 4)
            {
                sivaa.display();
            }
            else
            {
                break;
            }
        }
    }
}
