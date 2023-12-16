class CustomExceptionDev extends Exception 
{
    public CustomExceptionDev() 
    {
        super("Cannot find prime for negative range!");
    }
}

class Prime 
{
    private boolean isPrime(int n) 
    {
        if (n == 1)
        {
            return false;
        }
        for (int i = 2; i < n; i++) 
        {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    Prime(int lower, int upper) throws CustomExceptionDev
    {
        if (lower < 0 || upper < 0) 
        {
            throw new CustomExceptionDev();
        }
        for (int i = lower+1; i < upper; i++) 
        {
            if (isPrime(i)) 
            {
                System.out.print(i + " ");
            }
        }   
        System.out.println();
    }
}

public class Q1 
{
    public static void main(String args[]) throws CustomExceptionDev
    {
        Prime prime1 = new Prime(20, 50);
        Prime prime2 = new Prime(-20, 50);
    }
}