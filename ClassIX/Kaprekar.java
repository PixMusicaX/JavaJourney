package ClassIX;

import java.util.Scanner;
class Kaprekar
{public boolean isKaprekar(int n)
    {int c, q, r, l, sq = n * n;
        c = count(n);
        l = (int)Math.pow(10, c);
        r = sq % l;
        q = sq / l;
        if (r + q == n)
        return true;
        return false;
    }
    
    public static void main(String args[])
    {int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        Kaprekar ob = new Kaprekar();
        if (ob.isKaprekar(n))
        System.out.println(n + " is a Kaprekar number");
        else 
        System.out.println(n + " is not a Kaprekar number");
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