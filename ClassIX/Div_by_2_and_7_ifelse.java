package ClassIX;

class Div_by_2_and_7_ifelse
{public void check(int n)
    {if (n%2 == 0 && n%7 == 0)
        System.out.println("Divisible by 2 and 7");
        else if (n%2 == 0 && n%7 != 0)
        System.out.println("Divisible by 2 and not by 7");
        else if (n%2 != 0 && n%7 == 0)
        System.out.println("Divisible by 7 and not by 2");
        else
  System.out.println("Not divisible by 2 and 7");
}
}