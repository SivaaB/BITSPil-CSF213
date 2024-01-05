class PrimeChecker extends Thread 
{ 
    int start; 
    int end; 
    int sum = 0; 

    public PrimeChecker(int start, int end)
    { 
        this.start = start; 
        this.end = end; 
        this.sum = 0; 
    }

    public boolean isPrime(int number)
    {
        if (number <= 1)
        { 
            return false; 
        }

        for (int i = 2; i < Math.sqrt(number); i++)
        { 
            if (number % i == 0) 
            {
                return false;
            }
        }
        return true;
    } 

    public void run()
    {
        for (int i = start; i < end; i++)
        { 
            if (isPrime(i))
            { 
                sum+= i; 
            }
        }
    }

    public int getSum()
    { 
        return sum; 
    }
}

public class Q3
{
    public static void main (String[] args)
    { 
        int limit = 100; 
        int numThreads = 5; 
        int start = 1; 
        int end; 

        PrimeChecker[] primeCheckerArr_Of_Objs = new PrimeChecker[numThreads];
        Thread[] threads = new Thread[numThreads];

        int range = limit/numThreads; 

        for (int i = 0; i < numThreads; i++)
        { 
            if (i == numThreads - 1)
            { 
                end = limit; 
            }
            else
            { 
                end = start + range - 1; 
            }

            primeCheckerArr_Of_Objs[i] = new PrimeChecker(start, end);
            threads[i] = new Thread(primeCheckerArr_Of_Objs[i]);
            threads[i].start();

            start = end + 1; 
        }

        int totalSum = 0;
        for (PrimeChecker checker : primeCheckerArr_Of_Objs) 
        {
            totalSum += checker.getSum();
        } 
        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}