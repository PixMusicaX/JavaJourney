package ClassIX;

class Pythagorian_Triplex
{public void calculate(int a, int b, int c)
    {int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
        if ((max*max) == min*min + mid*mid)
           System.out.println("It is a pythagorian triplex");
           else
           System.out.println("It is not a pythagorian triplex");
     }
}