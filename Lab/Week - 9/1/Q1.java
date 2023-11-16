import java.util.*; 

class Student_ID
{ 
    int Year; 
    String Branch; 
    String PS_TS; 
    String Campus; 
    int Roll_Number; 

    public Student_ID (int Year, String Branch, String PS_TS, String Campus, int Roll_Number)
    { 
        this.Year = Year; 
        this.Branch = Branch; 
        this.PS_TS = PS_TS; 
        this.Campus = Campus; 
        this.Roll_Number = roll_number_gen(); 
    }

    public int roll_number_gen()
    { 
        Random rd = new Random(); 
        Roll_Number = rd.nextInt(1000); 
        return Roll_Number; 
    }

    public void Student_ID_Generator()
    { 
        
        System.out.println ("Roll Number is: " + Year + Branch + PS_TS + Roll_Number + Campus);
    }

    public void Student_Email_Generator()
    { 

        if (Campus == "P")
        { 
            System.out.println ("Email ID is: " + "f" + Year + Roll_Number + "@" + "pilani" + ".bits-pilani" + ".ac.in");
        }
        else if (Campus == "G")
        {
            System.out.println ("Email ID is: " + "f" + Year + Roll_Number + "@" + "goa" + ".bits-pilani" + ".ac.in");
        }
        else if (Campus == "H")
        { 
            System.out.println ("Email ID is: " + "f" + Year + Roll_Number + "@" + "hyderabad" + ".bits-pilani" + ".ac.in");
        }
        else
        { 
            System.out.println ("Email ID is: " + "f" + Year + Roll_Number + "@" + "dubai" + ".bits-pilani" + ".ac.in");
        }
        
    }
}

public class Q1
{ 
    public static void main (String[] args)
    { 
        int Year; 
        String Branch; 
        String PS_TS; 
        String Campus; 
        int Roll_Number; 

        Scanner sc = new Scanner(System.in); 

        System.out.println ("Enter Year: "); 
        Year = sc.nextInt(); 
        sc.nextLine(); 
        System.out.println ("Enter Branch: "); 
        Branch = sc.nextLine(); 
        System.out.println ("PS/TS: "); 
        PS_TS = sc.nextLine(); 
        System.out.println ("Campus: "); 
        Campus = sc.nextLine(); 

        Student_ID sc_id = new Student_ID(Year, Branch, PS_TS, Campus, 0);
        sc_id.Student_ID_Generator(); 
        sc_id.Student_Email_Generator(); 
    }
}