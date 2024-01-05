//Write a program to read a phone number as a string. It must then display the country code, and identify if the number is a landline number or a mobile phone and then the number,
// e.g. if the phone number is 00971558912308 – 00971 UAE Code 55 – mobile 0097147629309 – 00971 UAE code 4 - landline

import java.util.*; 
public class Q3
{ 
    public static void main (String[] args)
    { 
        Scanner sc = new Scanner(System.in); 

        sc.nextLine(); 
        System.out.println ("Enter contact number: "); 
        String line = sc.nextLine(); 

        int cn_length = line.length(); 

        if (cn_length == 14)
        { 
            System.out.println ("It's a Phone Number!"); 
            System.out.println ("Number is: " + line.substring (5, 13)); 
        }
        else 
        { 
            System.out.println ("It's a Landline Number!"); 
            System.out.println ("Number is: " + line.substring(5, 12)); 
        }
    }
}

