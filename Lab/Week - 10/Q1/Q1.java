import java.util.*; 

class Person 
{ 
    String name; 
    String address;

    public Person (String name, String address)
    { 
        this.name = name; 
        this.address = address; 
    }

    public String getName()
    { 
        return name; 
    }

    public String getAddress()
    { 
        return address; 
    }


    public void setAddress(String address)
    { 
        this.address = address; 
    }

    public String toString()
    { 
        return "Person[ Name = " + name + "," + "Address = " + address + "]"; 
    }
}

class Student extends Person 
{ 
    String program; 
    int year; 
    double fees; 

    public Student (String name, String address, String program, int year, double fees)
    { 
        super (name, address); 
        this.program = program; 
        this.year = year; 
        this.fees = fees; 
    }

    public String getProgram ()
    { 
        return program; 
    }

    public void setProgram(String porgram)
    { 
        this.program = program; 
    }

    public int getYear()
    { 
        return year; 
    }

    public void setYear(int Year)
    { 
        this.year = year; 
    }

    public double getFees()
    { 
        return fees; 
    }

    public void setFees(double fees)
    { 
        this.fees = fees; 
    }

    public String toString() 
    {
        return "Student[Person[Name = " + name + ", Address = " + address + "], Program = " + program + ", Year = " + year + ", Fee = " + fees + "]";
    }
}

class Staff extends Person 
{ 
    String school; 
    double pay; 

    public Staff (String name, String address, String school, double pay)
    { 
        super (name, address); 
        this.school = school; 
        this.pay = pay; 
    }

    public String getSchool()
    { 
        return school; 
    }

    public void setSchool(String school)
    { 
        this.school = school; 
    }

    public double getPay()
    { 
        return pay; 
    }

    public void setPay(double Pay)
    { 
        this.pay = pay; 
    }
}

public class Q1
{ 
    public static void Main (String[] args)
    { 
        Person person = new Person("John", "Home");
        Student student = new Student("John", "Home", "CS", 2, 10000);
        Staff staff = new Staff("John", "Home", "BITS", 10000);

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(staff.toString());
    }
}