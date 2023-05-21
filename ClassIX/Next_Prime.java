package ClassIX;

import java.util.Scanner;
class Next_Prime
{
    public static void main(String args[])
    {int n;
        Scanner sc = new Scanner(System.in);
        Next_Prime ob = new Next_Prime();
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int v = Fun.nextPrime(a);
        System.out.println("The next prime number is " + v);
    }
}
        