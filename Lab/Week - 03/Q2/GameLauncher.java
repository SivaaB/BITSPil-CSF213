import java.util.Scanner;
import java.util.Random;

public class GameLauncher {
    public static void main(String[] args) {
        System.out.println("Guessing Games - Guess a Number between 0 to 9!");

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        GuessGame game = new GuessGame(p1, p2, p3);
        game.startGame();
    }
}

class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;

    public GuessGame(Player player1, Player player2, Player player3) {
        this.p1 = player1;
        this.p2 = player2;
        this.p3 = player3;
    }

    public void startGame() {
        int p1Guess = p1.guess();
        int p2Guess = p2.guess();
        int p3Guess = p3.guess();

        Random random = new Random();
        int number = random.nextInt(10);

        System.out.println("The random number is: " + number);

        System.out.println("Winners are: ");
        if (number == p1Guess) {
            System.out.println("Winner-1");
        }
        if (number == p2Guess) {
            System.out.println("Winner-2");
        }
        if (number == p3Guess) {
            System.out.println("Winner-3");
        }
    }
}

class Player {
    private int guess;
    public int guess() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        guess = scanner.nextInt();
        return guess;
    }
}
