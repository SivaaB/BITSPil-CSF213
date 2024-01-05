import java.util.Scanner;

public class Q3 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j <= 10; j++) 
            {
                System.out.print((i*j)+"\t");
            } 
            System.out.println();
        }
    }
}