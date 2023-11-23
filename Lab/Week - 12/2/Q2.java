import java.util.*;

class Book implements Comparable<Book> 
{
    private String name;
    private double cost;

    Book(String name, double cost) 
    {
        this.name = name;
        this.cost = cost;
    }

    public int compareTo(Book book) 
    {
        return this.name.compareTo(book.getName());
    }

    public String getName() 
    {
        return name;
    }

    public double getCost() 
    {
        return cost;
    }
}

class BookComparator implements Comparator<Book> 
{
    public int compare(Book book1, Book book2) 
    {
        return Double.compare(book1.getCost(), book2.getCost());
    }

}

class GeneralizedSearch 
{
    public static boolean search(ArrayList<Book> arr, Book item) 
    {
         for (Book element : arr) 
         {
            if (element.getName().equals(item.getName())) 
            {
                return true;
            }
        }
        return false;
    }
}


public class Q2
{
    public static void main(String args[]) 
    {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Book A", 1));
        books.add(new Book("Book B", 2));
        books.add(new Book("Book C", 3));

        Book book = new Book("Book A", 10);
        if(GeneralizedSearch.search(books, book))
        {
            System.out.println(book.toString());
        }
        else
        {
            System.out.println("Book not found!");
        }

        BookComparator bc = new BookComparator();
        Collections.sort(books, bc);
        Collections.reverse(books);

        for (Book tempBook : books) 
        {
            System.out.println(tempBook.getName());
        }
    }
}