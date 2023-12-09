class greetings extends Thread 
{ 
    public void run() 
    { 
        System.out.println ("Hello World!"); 
    }
}

public class Q1
{ 
    public static void main (String[] args)
    { 
        greetings obj = new greetings(); 
        obj.run(); 
    }
}