import java.util.Scanner; 

public class Main
{ 
    public static void main (String[] args)
    { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println ("Term Number: "); 
        int n = scanner.nextInt(); 
        
        int prev = 0; 
        int current = 1; 
        int next; 

        for (int i = 2; i <= n; i++) 
        { 
            next = prev + current; 
            prev = current; 
            current = next; 
        }
        System.out.println ("The nth term is: " + current); 
    }
}