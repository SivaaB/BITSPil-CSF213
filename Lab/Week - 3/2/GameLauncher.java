import java.util.Scanner; 
import java.util.Random; 

public class GameLauncher
{ 
    public static void main (String[] args)
    { 
        System.out.println ("Guessing Games - Guess a Number between 0 to 9!"); 

        GuessGame game = new GuessGame();
        game.startGame(); 

        Player p1 = new Player(); 
        Player p2 = new Player(); 
        Player p3 = new Player(); 
    }
}

class GuessGame
{ 
    static int p1; 
    static int p2; 
    static int p3; 

    public static void startGame()
    { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println ("User-1: "); 
        int p1 = scanner.nextInt(); 
        System.out.println ("User-2: "); 
        int p2 = scanner.nextInt(); 
        System.out.println ("User-3: "); 
        int p3 = scanner.nextInt(); 

        int number = Player.guess(); 
        System.out.println ("The random number is: " + number); 
        
        System.out.println ("Winners are: "); 
        if (number == p1)
        { 
            System.out.println ("Winner-1"); 
        }
        if (number == p2)
        { 
            System.out.println ("Winnner-2"); 
        }
        if (number == p3)
        { 
            System.out.println ("Winnner-3"); 
        }
    }
} 

class Player
{ 
    public static int guess ()
    { 
        Random random = new Random(); 
        int number = random.nextInt(10); 
        return number; 
    }
}