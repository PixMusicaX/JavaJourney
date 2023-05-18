package ClassIX;

class Leap_year
{
public void display(int y) 
    {if (y%100 == 0)
        System.out.println(y + " is a leap year");
        else if (y%4 == 0 && y%100!= 0)
        System.out.println(y + " is a leap year");
        else
        System.out.println(y + " is not a leap year"); 
    }
}