package ClassX;

import Fun.Enjoy;
import java.util.Scanner;
//Drawback of program: At least one root must be natural (to prevent ininite loop)
public class CubicEquation
{
    public void cSolve(double x3, double x2, double x1, double x0)
    {
        double r;
        double c1 = 0;
        double c2 = 0;
        double nx2;
        double nx1;
        double nx0;
        double f1;
        double f2;
        double f3;
        while(true)
        {
           c1 += 1;
           c2 -= 1;
           if(x3*c1*c1*c1 + x2*c1*c1 + x1*c1 + x0 == 0)
              {f1 = c1;break;}
           else if(x3*c2*c2*c2 + x2*c2*c2 + x1*c2 + x0 == 0)
              {f1 = c2;break;}
        }
        // By Syntetic Division Method(By Horner's Method)
        nx2 = x3;
        nx1 = x2 + f1*nx2;
        nx0 = x1 + f1*nx1;
        // By Sridaracharya's Method
        f2 = (-nx1 + Math.sqrt(nx1*nx1 - 4*nx0*nx2))/(2*nx2);
        f3 = (-nx1 - Math.sqrt(nx1*nx1 - 4*nx0*nx2))/(2*nx2);
        
        System.out.println("The Three Factors are: " + f1 + " , " + f2 + " , " + f3);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        CubicEquation ob = new CubicEquation();
        System.out.println("If the Equation is ax3 + bx2 + cx + d");
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        if(a == 0)
          {
              System.out.println("Wrong Input!\nTerminating Program...   ");
              Enjoy.loop();
              Enjoy.loop();
              System.exit(0);
          }
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        System.out.print("Enter the value of d: ");
        double d = sc.nextDouble();
        ob.cSolve(a, b, c, d);
    }
}
        