package ClassX;

//program 2
//Finding common elements from two integer arrays of same length
//Note: Position note to be confused with index
import java.util.Scanner;
public class CommonElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[];// first array
        int brr[];// second array
        int n;// to store the length of the array
        boolean flag = false;// if no common elements present 
        System.out.print("Enter the length of the arrays: ");
        n = sc.nextInt();// taking input the length of both the arrays
        arr = new int[n];// initializing first array
        brr = new int[n];// initializing second array
        System.out.println("Enter elements of first array");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter element no." + (i + 1) + " : ");
            arr[i] = sc.nextInt();// taking input the elements of the first array
        }
        System.out.println("Enter elements of second array");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter element no." + (i + 1) + " : ");
            brr[i] = sc.nextInt();// taking input the elements of the second array
        }
        System.out.println("The Common Elements are:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == brr[j])
                {
                    System.out.println(brr[j]);
                    flag = true;
                }
            }
        }
        if(flag == false)
         System.out.println("NONE");
    }
}
        