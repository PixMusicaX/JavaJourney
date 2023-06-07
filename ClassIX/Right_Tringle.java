package ClassIX;

class Right_Tringle
{public void calculate(int b, int h)
    {double area;
        double peri;
    area = 0.5*b*h;
        peri = b + h + (Math.sqrt(Math.pow(b,2) + Math.pow(h,2)));
    System.out.println("The perimetre is: " + peri);
        System.out.println("The area is: " + area);
    }
}