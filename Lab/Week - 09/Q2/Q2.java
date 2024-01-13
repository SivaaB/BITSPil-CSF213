// Write a program to read a line of text, tokenizes the line and only displays the tokens which start with the letter “b”.

import java.util.*; 
public class Q2
{ 
    public static void main (String[] args)
    { 
        Scanner sc = new Scanner(System.in); 

        System.out.println ("Enter a line of text: "); 
        String line = sc.nextLine(); 

        String arr[] = new String[line.length()]; 
        arr = line.split(" "); 

        String arr_new[] = new String[line.length()]; 

        int i = 0; 
        for (String token : arr)
        { 
            if (token.startsWith("b"))
            { 
                arr_new[i] = token; 
                i++; 
            }
        }
        
        System.out.println (" "); 
        System.out.println ("Contains 'b' in it: "); 
        for (String token_new : arr_new)
        { 
            System.out.println(token_new); 
        }

    }
}