package ClassIX;

class Area
/* class name in copy is "room" */
{ double l, b, a;
    public void input(double x, double y)
    /* void means the value would not be returned */
    {l = x;
        b = y;
    }
    public void calculate()
    {a = l*b;
    }
    public void display()
    {System.out.println("The length is: " + l);
        System.out.println("The breath is: " + b);
        System.out.println("The area is: " + a);
    }
    /*difficult part */
    public static void main()
    {Area r1 = new Area();
        Area r2 = new Area();
        r1.input(10, 8);
        r1.calculate();
        r1.display();
        r2.input(21, 16);
        r2.calculate();
        r2.display();
    }// end of main
}//end of class
