package ClassX;

// program 14
// Delete an element from an integer array
// "position" input by user
// Note: String works on index not on position. DO NOT CONFUSE.
import java.util.*;
public class Delete
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[];// array variable
        int d;// for storing position to be deleted
        int n;// for storing no. of elements
        System.out.print("Enter the no. of elements required: ");
        n = sc.nextInt();// taking input no. of elements
        arr = new int[n];// initializing array
        for(int i = 0; i < n; i++)// taking input
        {
            System.out.print("Enter element no." + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position to be deleted: ");
        d = sc.nextInt();// taking input the position
        if(d <= 0 || d > n)// if wrong position
         System.out.print("Wrong position!");
        else
        {
            System.out.println("The modified array is:");
            for(int i = 0; i < n; i++)
            {
                if((d - 1) == i)
                 continue;
                else
                 System.out.print(arr[i] + " ");
            }
        }
    }
}