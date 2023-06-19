package ClassX;

//Program 3
// Binary Search
import java.util.Scanner;
class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        int arr[];// array variable
        int n;// for number 'to be searched'
        int p;// for storing the index of the found element
        int l;// for storing length of the array
        System.out.print("Enter length of the array: ");
        l = sc.nextInt();// taking input the length of the array
        arr = new int[l];// initializing array
        System.out.println("Enter elements of the array:");
        for(int i = 0; i < l; i++)
        {
             System.out.print("Enter element no." + (i + 1) + " : ");
             arr[i] = sc.nextInt();// taking input the elements of the array
        }
        System.out.print("Enter number to be searched: ");
         n = sc.nextInt();// taking input the number to be searched
         p = ob.bSearch(arr, n);// found index
         if(p == -1)
          System.out.println("Element not found");
         else
         { 
         System.out.println("Element found at index " + p );
         }
        }
    public int bSearch(int arr[], int data)
    {
        // returns the index in which it is found (else return -1)
        arr = selSort(arr);
        int lb = 0;// storing lowest element 
        int ub = arr.length - 1;// storing upper element
        int pos = -1;// for storing position
        while(lb<=ub)
        {
            int mid = (lb + ub)/2;
            if(arr[mid] > data)
            ub = mid - 1;
            else if(arr[mid] < data)
            lb = mid + 1;
            else
            {
                pos = mid;
                break;
            }
        }
        return pos;
    }
    
    public int[] selSort(int arr[])
    {//sorts the array in ascending order
        for(int i = 0; i < arr.length; i++)
        {int mp = i;
            for(int j = i + 1; j < arr.length; j++)
              if(arr[j] < arr[mp])
                mp = j;
         int t = arr[i];
         arr[i] = arr[mp];
         arr[mp] = t;
        }
        return arr;
    }
}
    

            
 