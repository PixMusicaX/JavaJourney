package ClassIX;

import java.util.Scanner;
class Only_product_of_prime_numbers
{public static void main(String args[])
    {int N, i, j, p = 1, c, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms required: ");
        N = sc.nextInt();
        for (i = 1; i <= N; i++)
        {System.out.print("Enter number " + i + " : ");
            a = sc.nextInt();
            c = 0;
            for (j = 1; j<= a; j++)
            if (a % j == 0)
            c += 1;
            if (c == 2)
            p *= a;
        }
        System.out.print("The product of prime numbers are: " + p);
    }
}