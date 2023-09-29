import java.util.Scanner;

class Element_Prop
{
    int an;
    String en, es, coe;
    double mass;

    public Element_Prop (int atomic_number, String element_name, String symbol, String class_of_element, double atomic_mass)
    {
        an = atomic_number;
        en = element_name;
        es = symbol;
        coe = class_of_element;
        mass = atomic_mass;
    }

    public void display ()
    {
        System.out.println (an);
        System.out.println (en);
        System.out.println (es);
        System.out.println (coe);
        System.out.println (mass);
    }
}

public class Element
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Atomic Number: ");
        int atomic_number = scanner.nextInt();
        scanner.nextLine();
        System.out.println ("Element Name: ");
        String element_name = scanner.nextLine();
        System.out.println ("Element Symbol: ");
        String symbol = scanner.nextLine();
        System.out.println ("Element Element Type: ");
        String class_of_element = scanner.nextLine();
        System.out.println ("Element Atomic Mass: ");
        double atomic_mass = scanner.nextDouble();

        Element_Prop sivaa = new Element_Prop(atomic_number, element_name, symbol, class_of_element, atomic_mass);
        sivaa.display();
    }
}