package ClassX;

import java.util.Scanner;
class Factors
{
    public static void factors()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int d = 2;
        while(n > 1)
        {
            if(n%d==0)
            {
                n = n/d;
                System.out.print(d + "  ");
            }
            else if(d > n)
            break;
            else 
            d++;
        }
    }
}