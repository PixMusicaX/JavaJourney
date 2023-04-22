package ClassIX;

import java.util.Scanner;
class Ascii_Range
{public static void main(String args[])
    {char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first range: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if(a > b)
        {a = a + b;
            b = a - b;
            a = a - b;
        }
        for ( int i = a; i <= b; i++)
        {c = (char)i;
            System.out.println(c);
        }
    }
}