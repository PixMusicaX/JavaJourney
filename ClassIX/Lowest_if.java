package ClassIX;

class Lowest_if
{public void display(int a, int b, int c)
    {if (a<b && a<c)
        System.out.println(a + " is the lowest number");
        else if (b<c)
        System.out.println(b + " is the lowest number");
        else
        System.out.println(c + " is the lowest number");
    }
}