import java.util.*; 

interface Moveable 
{ 
    public void move (String newsPos); 
}

abstract class ChessPiece implements Moveable 
{ 
    String name; 
    String color; 
    String curPos; 

    public ChessPiece (String name, String color, String curPos)
    { 
        this.name = name; 
        this.color = color; 
        this.curPos = curPos; 
    }

    public void move (String newPos)
    { 
        System.out.println (color + " " + name + " moving from " + curPos + " to " + newPos); 
        curPos = newPos; 
    }
}

class King extends ChessPiece
{
    public King (String color, String curPos)
    { 
        super ("King", color, curPos); 
    }
}

class Queen extends ChessPiece
{ 
    public Queen (String color, String curPos)
    { 
        super ("Queen", color, curPos); 
    }
}

class Pawn extends ChessPiece
{ 
    public Pawn (String color, String curPos)
    { 
        super ("Pawn", color, curPos); 
    }
}

public class Q1
{ 
    public static void main (String[] args)
    { 
        Scanner sc = new Scanner(System.in); 

        ArrayList<ChessPiece> pieces = new ArrayList<>(); 
        pieces.add(new King("White", "a7")); 
        pieces.add(new Queen("Black", "c2")); 
        pieces.add(new Pawn("White", "b2")); 

        System.out.println ("Created 3 chess Pieces (eg. King(White):1, Queen(Black):2 , Pawn(White):3)"); 

        while (true) 
        {
            System.out.print("Enter which piece to be moved (0 to Quit) & new Position: ");
            int pieceIndex = sc.nextInt();
            if (pieceIndex == 0) 
            {
                System.out.println("Bye, Thank you !!");
                break;
            }
            
            System.out.print("New Position: ");
            String newPos = sc.next();

            if (pieceIndex > 0 && pieceIndex <= pieces.size()) 
            {
                pieces.get(pieceIndex - 1).move(newPos);
            } 
            else 
            {
                System.out.println("Invalid piece index. Please try again.");
            }
        }
    }
}