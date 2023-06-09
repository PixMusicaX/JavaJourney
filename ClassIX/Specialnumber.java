package ClassIX;

class Specialnumber
{public void check(int n)
    {int a = n/10;
        int b = n%10;
        int add = a + b;
        int mul = a * b;
        if ((add + mul) == n)
        System.out.println(n + " is a special number");
        else
        System.out.println(n + " is not a special number");
    }
}