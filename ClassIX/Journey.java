package ClassIX;

class Journey
{public void calculate(int hr, int min)
    {int time = 2* (min + (hr*60));
        int rhr = time/60;
        int rmin = time%60;
        System.out.println("Total time taken: " + rhr + " hours and " + rmin + " minutes");
    }
}