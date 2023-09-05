import java.util.*; 

public class Space_2
{ 
    public static void main(String args[])
    { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println ("Enter a 5-Digit Number: "); 
        String s = scanner.nextLine(); 

        String p[] = s.split ("");
        for (int i = 0; i < 5; i++)
        { 
            System.out.print (p[i] + " "); 
        }
    }
} 