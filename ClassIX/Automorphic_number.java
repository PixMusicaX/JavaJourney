package ClassIX;

import java.util.Scanner;
class Automorphic_number
{public static void main(String args[])
    {int n, c, sq;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        Automorphic_number ob = new Automorphic_number();
        c = ob.count(n);
        sq = n * n;
        if (sq % (int)Math.pow(10, c) == n)
        System.out.print(n + " is a automorphic number");
        else
        System.out.print(n + " is not a automorphic number");
    }
    
    public int count(int n)
    {int c = 0, k = Math.abs(n);
        while (k > 0)
        {k = k/10;
            c++;
        }
        return c;
    }
}