package ClassX;

import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int f = -1, s = 1,t = 0;
        for (int i = 1; i < 10; i++)
        {   t = f + s;
            f = s;
            s = t;
            System.out.println(t);
        }
    }
}