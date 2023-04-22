package ClassIX;

class Ascii2
{public void check(char c)
    {if (c >= 'A' && c <= 'Z')
        System.out.println(c + " is a capital letter");
        else if (c >='a' && c <= 'z')
        System.out.println(c + " is a small letter");
        else if (c >= '0' && c <= '9')
        System.out.println(c + " is a number");
        else
        System.out.println(c + " is a special charecter");
    }
}
