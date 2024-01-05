import java.util.*;

public class Q4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.print("Enter another String: ");
        String s2 = sc.nextLine().toLowerCase();

        int count1 = 0;
        int count2 = 0;
        int ascii;

        for (int i = 0; i < s1.length(); i++) 
        {
            ascii = (int)(s1.charAt(i));
            if (ascii > 96 && ascii < 123) 
            {
                count1 += ascii;
            }
        }

        for (int i = 0; i < s2.length(); i++) 
        {
            ascii = (int)(s2.charAt(i));
            if (ascii > 96 && ascii < 123)
            {
                count2 += ascii;
            }
        }

        if (count1 == count2) 
        { 
            System.out.println("It is an anagram!"); 
        }
        else
        { 
            System.out.println("Is is not an anagram!");
        }
    }
}