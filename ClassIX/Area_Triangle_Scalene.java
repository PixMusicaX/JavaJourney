package ClassIX;

class Area_Triangle_Scalene
{public void calculate(double a, double b, double c)
    {double s = (a+b+c)/2;
        double area = Math.sqrt((s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is: " + area);
    }
}