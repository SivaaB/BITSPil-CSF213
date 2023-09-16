import java.util.Scanner; 

public class Main
{ 
    public static void main (String[] args)
    { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println ("Enter Number-1: "); 
        int n1 = scanner.nextInt(); 
        System.out.println ("Enter Number-2: "); 
        int n2 = scanner.nextInt(); 

        while (n2 != 0)
        { 
            int temp = n2; 
            n2 = n1 % n2; 
            n1 = temp; 
        }

        System.out.println ("The GCD is: " + n1); 
    }
}
