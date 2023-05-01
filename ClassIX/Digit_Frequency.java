package ClassIX;

import java.util.Scanner;
class Digit_Frequency
{public static void main()
    
    {Scanner sc = new Scanner(System.in);
        Digit_Frequency ob = new Digit_Frequency();
        int n, c, k;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        int con = 0;
        c = n;
        System.out.println("In " + n + ",");
        while (con < 10)
        {k = Fun.Freq(n, con);
            if(k != 0)
              System.out.println(con + " returns " + k + " times");
            con++;
            
        }
    }
}




