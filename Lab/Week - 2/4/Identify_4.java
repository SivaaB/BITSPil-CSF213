import java.util.Scanner;

public class Identify_4
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println ("5 Numbers: ");
        for (int i = 0; i < 5; i++)
        {
            int check = scanner.nextInt();

            if (check > 0)
            {
                // System.out.println (check + " - Positive");
                positiveCount++;
            }

            else if (check < 0)
            {
                // System.out.println (check + " - Negative");
                negativeCount++;
            }

            else
            {
                // System.out.println (check + " - Zero");
                zeroCount++;
            }
        }

        System.out.println ("Positive Integers : " + positiveCount);
        System.out.println ("Negative Integers : " + negativeCount);
        System.out.println ("Zero Integers : " + zeroCount);
    }
}