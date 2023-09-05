import java.util.Scanner; 
public class Circle_1
{ 
    public static void main(String[] args)
    { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println ("Radius: "); 
        float radius = scanner.nextFloat(); 

        float diameter = (float)(radius * 2); 
        System.out.println ("Diameter : " + diameter);
        float circumference = (float)(2 * 3.14 * radius); 
        System.out.println ("Circumference : " + circumference);
        float area = (float)(3.14 * radius * radius); 
        System.out.println ("Area : " + area);

    }
}