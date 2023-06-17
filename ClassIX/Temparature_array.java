package ClassIX;

import java.util.Scanner;
class Temparature_array
{public double toCelcius(double f)
    {double c;
        c = (5.0*(f - 32))/9.0;
        return c;
    }
    
    public static void main(String args[])
    {double c[] = new double[10];
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        Temparature_array ob = new Temparature_array();
        for(int i = 0; i < arr.length; i++)
        {System.out.print("Enter Temparature no." + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            c[i] = arr[i] * 1.0;
        }
        for(int i = 0; i < arr.length; i++)
        {c[i] = ob.toCelcius(c[i]);
            System.out.println("Temparature no." + (i + 1) + " (in Celcius): " + c[i]);
        }
    }
}
        