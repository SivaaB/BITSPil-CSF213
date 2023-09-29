import java.util.Scanner;

class Vote
{
    int countc1, countc2, countc3, countc4, countc5, count_spoilt = 0;

    public void count (int votes[], int voters)
        {
            for (int i = 0; i < voters; i++)
            {
                if (votes[i] == 1) {countc1++;}
                else if (votes[i] == 2) {countc2++;}
                else if (votes[i] == 3) {countc3++;}
                else if (votes[i] == 4) {countc4++;}
                else if (votes[i] == 5) {countc5++;}
                else {count_spoilt++;}
            }
        }

    public void display ()
    {
        System.out.println ("Candidate - 1: " + countc1);
        System.out.println ("Candidate - 2: " + countc2);
        System.out.println ("Candidate - 3: " + countc3);
        System.out.println ("Candidate - 4: " + countc4);
        System.out.println ("Candidate - 5: " + countc5);
        System.out.println ("Spoilt Ballot: " + count_spoilt);
    }
}

public class Election
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Number of Voters: ");
        int voters = scanner.nextInt();

        int[] votes = new int[voters];

        for (int i = 0; i < voters; i++)
        {
            System.out.println ("Pick between 1-5 Candidate!");
            int vote = scanner.nextInt();
            votes[i] = vote;
        }

        Vote sivaa = new Vote();
        sivaa.count (votes, voters);
        sivaa.display();
    }
}