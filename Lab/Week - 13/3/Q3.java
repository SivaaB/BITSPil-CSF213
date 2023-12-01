import java.util.Scanner;

class SumThread extends Thread 
{
    private int[] numbers;
    private int start;
    private int end;
    private long partialSum;

    public SumThread(int[] numbers, int start, int end) 
    {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public long getPartialSum() 
    {
        return partialSum;
    }

    public void run() 
    {
        for (int i = start; i <= end; i++) 
        {
            partialSum += numbers[i];
        }
    }
}

public class Q3
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int num = scanner.nextInt();

        System.out.print("Enter the number of threads: ");
        int n = scanner.nextInt();

        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) 
        {
            numbers[i] = i + 1;
        }

        int numbersPerThread = num / n;

        SumThread[] threads = new SumThread[n];
        for (int i = 0; i < n; i++) 
        {
            int start = i * numbersPerThread;
            int end;
            if (i == n - 1) 
            {
                end = num - 1;
            } 
            else 
            {
                end = start + numbersPerThread - 1;
            }
            threads[i] = new SumThread(numbers, start, end);
            threads[i].start();
        }

        try 
        {
            for (SumThread thread : threads) 
            {
                thread.join();
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        long finalSum = 0;
        for (SumThread thread : threads) 
        {
            finalSum += thread.getPartialSum();
        }

        System.out.println("Final sum: " + finalSum);
    }
}