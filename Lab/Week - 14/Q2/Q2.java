class EvenThread extends Thread
{ 
    public void run()
    { 
        System.out.println ("Even Numbers: "); 
        for (int i = 1; i <= 20; i++)
        { 
            if (i % 2 == 0)
            { 
                System.out.println (i); 
            }
        }
    }
}

class OddThread extends Thread
{ 
    public void run()
    { 
        System.out.println (" "); 
        System.out.println ("Odd Numbers: "); 
        for (int i = 1; i <= 20; i++)
        { 
            if (i % 2 != 0)
            { 
                System.out.println (i); 
            }
        }
    }
}

public class Q2 
{ 
    public static void main (String[] args)
    { 
        EvenThread et = new EvenThread(); 
        OddThread ot = new OddThread(); 

        et.run(); 
        ot.run();
    }
}