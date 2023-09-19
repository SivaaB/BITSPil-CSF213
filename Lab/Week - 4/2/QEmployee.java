import java.util.Scanner;

class Employee
{ 
    String id, name; 
    int dept; 
    double basic; 
    double allowance; 
    double totalSalary; 

    public Employee (String id, String name, int dept, float basic)
    { 
        this.id = id; 
        this.name = name; 
        this.dept = dept; 
        this.basic = basic; 
    }

    void calculateSalary() 
    { 
        if (dept == 1)
        {
            allowance = 1500; 
        }
        else if (dept == 2)
        {
            allowance = 2500; 
        }
        else 
        { 
            allowance = 3500; 
        }

        totalSalary = (basic + (0.4 * basic) + (allowance)); 

    }

    void displayDetails()
    { 
        System.out.println ("**************"); 
        System.out.println (id); 
        System.out.println (name); 
        System.out.println (dept); 
        System.out.println ("Basic Salary : " + basic); 
        System.out.println ("Allowance : " + allowance); 
        System.out.println ("Total Salary : " + totalSalary); 
    }
}

public class QEmployee
{ 
    public static void main(String[] args)
    { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println ("Enter ID: "); 
        String id = scanner.nextLine(); 
        System.out.println ("Enter Name: "); 
        String name = scanner.nextLine(); 
        System.out.println ("Enter Department: "); 
        int dept = scanner.nextInt(); 
        System.out.println ("Enter Basic Salary: "); 
        float basic = scanner.nextFloat(); 
        

        Employee sivaa = new Employee (id, name, dept, basic);
        sivaa.calculateSalary();
        sivaa.displayDetails(); 
    }
}