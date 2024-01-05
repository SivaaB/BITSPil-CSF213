import java.util.*;

class FlightDest 
{
    private String flightNo;
    private String destination;

    public FlightDest(String flightNo, String destination) 
    {
        this.flightNo = flightNo;
        this.destination = destination;
    }

    public String getFlightNo() 
    {
        return flightNo;
    }

    public String getDestination() 
    {
        return destination;
    }
}

class FlightInfo {
    private ArrayList<FlightDest> flightDestList; // Moved the declaration here

    public FlightInfo() 
    {
        flightDestList = new ArrayList<>(); // Initialize the ArrayList
    }

    public void addFlightDestPair(String fNo, String dest) 
    {
        FlightDest flightDest = new FlightDest(fNo, dest);
        flightDestList.add(flightDest);
    }

    public ArrayList<String> getFlightsDest(String dest) 
    {
        ArrayList<String> flightsForDestination = new ArrayList<>();
        for (FlightDest flightDest : flightDestList) 
        {
            if (flightDest.getDestination().equalsIgnoreCase(dest)) 
            {
                flightsForDestination.add(flightDest.getFlightNo());
            }
        }
        return flightsForDestination;
    }
}

public class Q1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        FlightInfo sivaa = new FlightInfo();

        System.out.println("Enter the number of flight details: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter Flight Number: ");
            String flightNo = scanner.nextLine();
            System.out.println("Enter Destination: ");
            String flightDest = scanner.nextLine();
            sivaa.addFlightDestPair(flightNo, flightDest);
        }

        System.out.println("Enter a destination to get flights: ");
        String dest = scanner.nextLine();
        ArrayList<String> flights = sivaa.getFlightsDest(dest);
        System.out.println("Flights to " + dest + ": " + flights);
    }
}
