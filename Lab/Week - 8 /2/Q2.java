import java.util.*;

class Book 
{
    Scanner scanner = new Scanner(System.in);
    
    private long ISBN_no;
    private String name;
    private int edition; 
    private String author; 
    private String publisher;
    private int status; 
    
    public Book (long ISBN_no, String name, int edition, String author, String publisher, int status)
    {
        this.ISBN_no = ISBN_no; 
        this.name = name; 
        this.edition = edition; 
        this.author = author;
        this.publisher = publisher; 
        this.status = status; 
    }

    public void checkStatus() 
    {
        switch (status) 
        {
            case 0:
            {
                System.out.println ("Available");
                break;
            }
            case 1:
            {
                System.out.println ("Issued");
                break; 
            }
            case 2:
            {
                System.out.println ("Reserved");
                break; 
            }
            default:
            {
                System.out.println ("Invalid!");
                break; 
            }
        }
    }

    public void changeStatus() 
    {
        System.out.println ("Status Codes: "); 
        System.out.println ("Available (0)"); 
        System.out.println ("Issued (1)"); 
        System.out.println ("Reserved (2)"); 
        
        System.out.println ("Current Status is : " + status);
        
        System.out.println ("What would you like to change the status to: "); 
        status = scanner.nextInt(); 
    }

    public void display()
    {
        System.out.println ("ISBN Number: " + ISBN_no); 
        System.out.println ("Name: " + name); 
        System.out.println ("Edition: " + edition); 
        System.out.println ("Author: " + author); 
        System.out.println ("Publisher: " + publisher); 
        System.out.println ("Status: " + status); 
    }
}

public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Book> bookArr = new LinkedList<Book>(); 

        System.out.println ("Adding 2 Books as Instructed in Question!"); 
        System.out.println ("\n"); 
        Book book1 = new Book (10697, "SEPS", 4, "Thakur", "AUH", 0); 
        Book book2 = new Book (323, "BITS", 2, "SMadapausi", "DXB", 0); 
        bookArr.add(book1); 
        bookArr.add(book2); 

        System.out.println ("Status of Book - 0"); 
        bookArr.get(0).checkStatus(); 
        System.out.println ("\n"); 
        bookArr.get(0).changeStatus(); 
        System.out.println ("New Status of Book - 1"); 
        bookArr.get(1).checkStatus(); 
        System.out.println ("\n"); 

        System.out.println ("Displaying Details of Book - 0"); 
        bookArr.get(0).display(); 
        System.out.println ("\n"); 
        Book book3 = new Book (10697-1, "SEPS_1", 4, "Thakur_1", "AUH_1", 0); 
        Book book4 = new Book (323-1, "BITS_1", 2, "SMadapausi_1", "DXB_1", 0);
        bookArr.addFirst(book3); 
        bookArr.addLast(book4); 

        bookArr.get(0).display(); 
        bookArr.get(3).display();
}
}