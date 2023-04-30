package ClassIX;

import java.util.Scanner;
class Coprime
{public int HCF(int a, int b)
    {int r = a % b;
        while (r != 0 )
        {a = b; 
            b = r;
            r = a % b;
        }
        return b;
    }
    
    public static void main(String args[])
    {int a, b, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        Coprime ob = new Coprime();
        r = ob.HCF(a,b);
        if (r==1)
        System.out.println(a + " and " + b + " are coprime");
        else
        System.out.println(a + " and " + b + " are not coprime");
    }
}