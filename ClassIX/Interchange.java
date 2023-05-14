package ClassIX;

class Interchange
{public void calculate(int n1, int n2)
    {System.out.println("The numbers before swapping are: " +n1 +" " + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("The numbers after swapping are: " + n1 + " " + n2);
    }
}