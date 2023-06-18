package ClassX;

import java.util.Scanner;
class ArrayProb
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l;
        int sum = 0, min, max;
        System.out.print("Enter the length of the array: ");
        l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter elements of array");
        System.out.print("Enter element no.1: ");
        arr[0] = sc.nextInt();
        min = arr[0];
        max = arr[0];
        sum = arr[0];
        for(int i = 1; i < l; i++)
        {
           System.out.print("Enter element no." + (i + 1) + ": ");
           arr[i] = sc.nextInt();
           if(min > arr[i])
           min = arr[i];
           if(max < arr[i])
           max = arr[i];
           sum += arr[i];
        }
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);
        System.out.println("The sum is " + sum);
    }
}
        