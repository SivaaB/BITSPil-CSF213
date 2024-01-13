import java.util.*; 

abstract class Car
{ 
    double price; 
    int year; 

    public Car (double price, int year)
    { 
        this.price = price; 
        this.year = year; 
    }

    abstract double calculateSalePrice(); 
}

class classicCar extends Car
{ 
    public classicCar (double price, int year)
    { 
        super (price, year); 
    }

    public double calculateSalePrice()
    { 
        return 10000d; 
    }
}

class sportsCar extends Car
{ 
    public sportsCar (double price, int year)
    { 
        super (price, year); 
    }

    public double calculateSalePrice()
    { 
        if (year > 2000)
        { 
            return 0.75 * price; 
        }

        else if (year > 1995)
        { 
            return 0.75 * price; 
        }

        else 
        { 
            return 0.5 * price; 
        }
    }
}

public class Q2 
{
    public static void main(String args[]) 
    {

        classicCar cc = new classicCar(500, 2002);
        sportsCar sc1 = new sportsCar(100, 2002);
        sportsCar sc2 = new sportsCar(100, 1997);
        sportsCar sc3 = new sportsCar(100, 1987);

        System.out.println(cc.calculateSalePrice());
        System.out.println(sc1.calculateSalePrice());
        System.out.println(sc2.calculateSalePrice());
        System.out.println(sc3.calculateSalePrice());
    }
} 