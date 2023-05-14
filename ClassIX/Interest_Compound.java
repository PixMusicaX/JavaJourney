package ClassIX;

class Interest_Compound
//enter principal, rate and time. Get the amount!
{double a;
    public void display(double p, double r, double t)
    {a = p*Math.pow((1 + r/100),t)*1.00;
        a = a * 1.00;
        System.out.println("Your interest is: " + (a - p));
        System.out.println("The amount you need to pay is " + a);
    }
}