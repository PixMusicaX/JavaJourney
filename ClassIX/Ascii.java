package ClassIX;

class Ascii
// please enter only one charecter
{public void check(char a)
    {System.out.println(a);
    if (a >=65 && a <= 90)
        System.out.println("It is a capital letter");
        else if (a >= 97 && a<=122)
        System.out.println("It is a small letter");
        else if (a >= 48 && a <= 57)
        System.out.println("It is a number");
        else
        System.out.println("It is a special charecter");
    }
}