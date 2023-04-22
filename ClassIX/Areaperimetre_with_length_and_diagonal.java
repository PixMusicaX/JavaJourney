package ClassIX;

class Areaperimetre_with_length_and_diagonal
 {public void calcudisplay(int l, int d)
{int b = (d*d - l*l)^1/2;
int area = l*b;
int perimetre = 2*(l + b);
System.out.println ("The area is: " + area);
    System.out.println("The perimetre is: " + perimetre);
}
}
