import java.util.*; 

public class Q2
{ 
    public int[] dupli_finder(int[] og_array, int n)
    {
        int[] dupli_array = new int[n]; 
        
        for (int i = 0; i < n; i++)
        { 
            int count = 0; 
            int dupli_element = og_array[i]; 
            for (int j = i+1; j < n; j++)
            { 
                if (og_array[i] == og_array[j])
                { 
                    count++; 
                }

                if (count >= 2)
                {
                    dupli_array[j] = dupli_element; 
                }
            }
        }
        return dupli_array; 
    }

    public int[] dupli_finder_counter(int[] og_array, int n)
    {
        int[] dupli_array_count = new int[n]; 
        
        for (int i = 0; i < n; i++)
        { 
            int count = 0; 
            int dupli_element = og_array[i]; 
            for (int j = i+1; j < n; j++)
            { 
                if (og_array[i] == og_array[j])
                { 
                    count++; 
                }

                if (count > 1)
                {
                    dupli_array_count[j] = count + 1; 
                }
            }
        }
        return dupli_array_count; 
    }

    public static void main (String[] args)
    { 
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Number of Elements in Array: "); 
        int n = scanner.nextInt(); 
        int[] og_array = new int[n]; 
        for (int i = 0; i < n; i++)
        { 
            System.out.println ("Enter " + (i+1) + "th element: "); 
            int element = scanner.nextInt(); 
            scanner.nextLine();
            og_array[i] = element;
        }

        Q2 sivaa = new Q2(); 

        int[] dupli_finder_array = new int[n]; 
        dupli_finder_array = sivaa.dupli_finder(og_array, n); 
        int[] dupli_finder_array_counter = new int[n]; 
        dupli_finder_array_counter = sivaa.dupli_finder_counter(og_array, n);

        System.out.println("The duplicate elements and their counts are: ");
        for (int j = 0; j < dupli_finder_array.length; j++) 
        {
            if (dupli_finder_array[j] != 0) 
                {
                    System.out.println("The element " + dupli_finder_array[j] + " appears " + dupli_finder_array_counter[j] + " time(s)!");
                }
        }
    }
}