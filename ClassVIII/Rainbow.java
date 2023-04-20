package ClassVIII;

class Rainbow
{
    void display(char col)
    {
        switch(col)
        {
            case 'V':
            case 'v':
            System.out.print("Violet");
            break;
            case 'I':
            case 'i':
            System.out.print("Indigo");
            break;
            case 'B':
            case 'b':
            System.out.print("blue");
            break;
            case 'G':
            case 'g':
            System.out.print("Green");
            break;
            case 'Y':
            case 'y':
            System.out.print("Yellow");
            break;
            case 'O':
            case 'o':
            System.out.print("Orange");
            break;
            case 'R':
            case 'r':
            System.out.print("Red");
            break;
            default:
            System.out.print("Wrong choice!!");
        }
    }
}