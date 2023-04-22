package ClassIX;

import java.util.Scanner;
class Averageof10numbers_array
{public static void main(String args[])
    {int sum = 0, r; double avg;
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        for (int i = 0; i < n.length; i++)
        {System.out.print("Enter number " + (i + 1)+ ": ");
            n[i] = sc.nextInt();
            sum += n[i];
        }
        avg = sum/10;
        System.out.print("The average is : " + avg);
    }
}