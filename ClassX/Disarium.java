package ClassX;

import java.util.Scanner;
class Disarium
{
    //parameterized constructor used
    int No;
    
    public Disarium(int n)
    {
        No = n;
    }
    
    public int calculateDigit()
    {
        return(String.valueOf(No).length());
    }
    
    public boolean isDisarium()
    {
        int s = 0;
        int c = No;
        int k = calculateDigit();
        while(c!=0)
        {
            int d = c % 10;
            s+= (int)Math.pow(d, k--);
            c = c / 10;
        }
        return (s == No);
    }
    
    public void show()
    {
        if(isDisarium())
        {
            System.out.println(No + " is a Disarium number");
        }
        else
        System.out.println(No + " is not a Disarium number");
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Disarium ob = new Disarium(n);
        ob.show();
    }
}

           