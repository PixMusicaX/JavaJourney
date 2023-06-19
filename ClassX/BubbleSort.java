package ClassX;

import java.util.Scanner;
import Fun.SortSrch;
public class BubbleSort
{
    static int arr[];
    int size;
    static Scanner sc = new Scanner(System.in);
    public BubbleSort(int n)
    {
        arr = new int[n];
        size = n;
    }
    
    public void accept()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter number " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
    }
    
    public void show()
    {
        for(int i = 0; i < size; i++)
        System.out.println("Element " + (i + 1) + " : " + arr[i]);
    }
    
    public static void main(String args[])
    {
        System.out.print("Enter Size: ");
        SortSrch en = new SortSrch();
        int n = sc.nextInt();
        BubbleSort ob =new BubbleSort(n);
        ob.accept();
        en.bSort(arr);
        ob.show();
    }
}