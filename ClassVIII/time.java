package ClassVIII;

class time
{
    void convert(int min)
    {
        int h, m;
        h = min/60;
        m = min%60;
        System.out.print("The time is: "+h+" hours "+m+" minutes");
    }
}