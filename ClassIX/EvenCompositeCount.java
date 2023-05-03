package ClassIX;

import java.util.Scanner;
class EvenCompositeCount
{public boolean isComposite(int n)
    {int f = 0;
        for (int i = 0; i <= n; i++)
        if (n%i == 0)
        f++;
        if (f > 2)
        return true;
        return false;
    }
    public static void main(String args[])
    {int c = 0;
        EvenCompositeCount ob = new EvenCompositeCount();
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
        {System.out.print("Enter no. " + (i + 1) + " = ");
            a[i] = sc.nextInt();
            if(ob.isComposite(a[i]) == false)
            {System.out.print("Wrong Input! Try Again.");
                i--;
                continue;
            }
        }
        for(int i = 0; i < a.length; i++)
        if (a[i] % 2 == 0)
        c++;
        System.out.println("The count of even numbers is: " + c);
    }
}