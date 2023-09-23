import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter Character: ");
        String character = scanner.nextLine();

        if (character.length() == 1)
        {
            char ch = character.charAt(0);
            int ascii = (int) ch;
            System.out.println (ascii);

            if (ascii >= 97  && ascii <= 122)
            {
                System.out.println ("It is a lower-case character!");
            }
            else
            {
                System.out.println ("It is not a lower-case character!");
            }
        }
        else
        {
            System.out.println("Please enter a single character.");
        }
    }
}
