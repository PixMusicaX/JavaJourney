package ClassIX;

import java.util.Scanner;
class Krishnamurthy
{public int fact(int n)
    {int fact = 1;
        for (int i = 1; i <= n; i++)
        fact *= n;
        return fact;
    }
    
    public static void main(String args[])
    {int n, s = 0, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        Krishnamurthy ob = new Krishnamurthy();
        c = n;
        while(c != 0)
        {d = c % 10;
            s += ob.fact(d);
            c = c / 10;
        }
        if(n == s)
        System.out.print(n + " is a krishnamurthy number");
        else
        System.out.print(n + " is a krishnamurthy number");
    }
}