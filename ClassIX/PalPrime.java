package ClassIX;

import java.util.Scanner;
class PalPrime
{public static void main(String args[])
    {int n; 
        Scanner sc = new Scanner(System.in);
        Next_Prime ob2 = new Next_Prime();
        PalPrime ob1 = new PalPrime();
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        if (Fun.isPal(n) && Fun.isPrime(n))
        System.out.print(n + " is a Palprime number");
        else
        System.out.print(n + " is not a Palprime number");
    }
}
        