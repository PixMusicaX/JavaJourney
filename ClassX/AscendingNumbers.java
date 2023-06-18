package ClassX;

import java.util.Scanner;
class AscendingNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        String s = new String();
        for(char k = '0'; k <= '9'; k++)
        {
            for(int i = 0; i < str.length(); i++)
            {
                 char ch = str.charAt(i);
                 if(ch == k)
                  s += ch;
            }
        }
        System.out.println("The number ascending order is " + s);
    }
}