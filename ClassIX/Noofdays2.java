package ClassIX;

class Noofdays2
{public void calculate(int d)
    {int year = d/365;
        int day = d%365;
        int month = day/30;
        day = day%30;
        System.out.println(d + " days are " + year + " year(s) " + month + " month(s) and " + day + " days.");
    }
}
        