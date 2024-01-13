interface Sortable 
{
    public void sort(int[] arr);
}

class BubbleSort implements Sortable 
{
    public void sort(int[] arr) 
    {
        int temp;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr.length-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable   // Using two arrow marks to check if the number is greater or smaller. 
{
    public void sort(int[] arr) 
    {
        int smallestPosition;
        int temp;
        for (int i = 0; i < arr.length; i++) 
        {
            smallestPosition = i;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < arr[smallestPosition])
                    smallestPosition = j;
            temp = arr[smallestPosition];
            arr[smallestPosition] = arr[i];
            arr[i] = temp;
        }
    }
}

class InsertionSort implements Sortable 
{
    public void sort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}



public class Q3 
{
    public static void main(String args[]) 
    {
        int[] arr1 = new int[] {4,3,6,8,2,7};
        int[] arr2 = new int[] {5,7,3,2,6,9};

        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i]+" ");
        System.out.println();
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i]+" ");
        System.out.println();

        BubbleSort bs = new BubbleSort();
        bs.sort(arr1);

        SelectionSort ss = new SelectionSort();
        ss.sort(arr2);

        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i]+" ");
        System.out.println();
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i]+" ");
        System.out.println();
    }
}