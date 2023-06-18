package ClassX;

import java.util.Scanner;
public class AddDist
{
    int feet;
    int inch;
    public AddDist()
    {
        feet = 0;
        inch = 0;
    }
    
    public AddDist(int f, int i)
    {
        feet = f;
        inch = i;
    }
    
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        feet = sc.nextInt();
        System.out.print("Enter inch: ");
        inch = sc.nextInt();
    }
    
    AddDist add(AddDist d1, AddDist d2)
    {
        AddDist d3 = new AddDist();
        d3.feet = d1.feet + d2.feet;
        d3.feet += (d1.inch + d2.inch)/12;
        d3.inch = (d1.inch + d2.inch)%12;
        return d3;
    }
    
    public void display()
    {
        System.out.println("The feet are: " + feet);
        System.out.println("The inches are: " + inch);
    }
    
    public static void main()
    {
        AddDist d1 = new AddDist();
        AddDist d2 = new AddDist();
        System.out.println("Enter first data: ");
        d1.accept();
        System.out.println("Enter second data: ");
        d2.accept();
        AddDist d3 = new AddDist();
        d3 = d3.add(d1, d2);
        d3.display();
    }
}
