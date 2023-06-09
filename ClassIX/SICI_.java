package ClassIX;

class SICI_
{public void calculate(double p, double r, double t, int ch)
    {double a = 0;
        switch (ch)
        {case 1:
            double si = p*r*t/100.0;
            a = p + si;
            break;
            case 2:
            a = p*Math.pow((1 + r/100.0),t);
            break;
            default:
            System.out.println("Invalid choice");
        }
        System.out.println("Your amount is: " + a);
    }
}