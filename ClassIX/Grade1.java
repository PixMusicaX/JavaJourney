package ClassIX;

class Grade1
{char g;
    public void display(int maths, int science, int computer)
 {   double avg = (maths + science + computer)/3.0;
    if (avg >= 80.0 && avg <= 100)
    g = 'A';
    else if (avg >= 60.0)
    g = 'B';
    else if (avg >= 40.0)
    g = 'C';
    else if (avg < 40.0 && avg >=0)
    g = 'D';
    else
    System.out.println("You cheated!");g = 'D';
    System.out.println("Your grade is: " + g);
}
}