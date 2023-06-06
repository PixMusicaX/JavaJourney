package ClassIX;

import java.util.Scanner;
class Pythagorian_Triplex_Range
{public static void main(String args[])
    {int a, b;
        Scanner sc = new Scanner(System.in);
        Pythagorian_Triplex_Range ob = new Pythagorian_Triplex_Range();
        System.out.print("Enter range 1: ");
        a = sc.nextInt();
        System.out.print("Enter range 2: ");
        b = sc.nextInt();
        if(a > b)
        {a = a + b;
            b = a - b;
            a = a - b;
        }
        for(int i = a; i <= b; i++)
        {for (int j = a; j <= b; j++)
            {for (int k = a; k <= b; k++)
                {if(ob.check(i,j,k))
                 { System.out.println(i + ", " + j + " & " + k);
                 }
                }
            }
        }
    }
    
    public boolean check(int a, int b, int c)
    {if (a*a + b*b == c*c)
        return true;
        return false;
    }
}
        
        