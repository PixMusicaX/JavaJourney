package ClassVIII;

class Dayofweek
{
    void display(int day)
    {
        switch(day)
        {
            case 1:
            System.out.print("Monday");
            break;
            case 2:
            System.out.print("Tuesday");
            break;
            case 3:
            System.out.print("Wadnesday");
            break;
            case 4:
            System.out.print("Thursday");
            break;
            case 5:
            System.out.print("Friday");
            break;
            case 6:
            System.out.print("Saturday");
            break;
            case 7:
            System.out.print("Sunday");
            break;
            default:
            System.out.print("ERROR...Please try again");
        }
        System.out.print("(press ctrl+k)");
    }
}