package ClassIX;

class Sidesquare_area_peri_dia
{public void calc(double s, short ch)
    {switch(ch)
        {case 1:
        double area = s*s;
        System.out.println("Area is " + area);
        break;
        case 2:
        double peri = 4.0*s;
        System.out.println("Perimetre is " + peri);
        break;
        case 3:
        double dia = Math.sqrt(2*s*s);
        System.out.println("Diagonal is " + dia);
        break;
        default:
        System.out.println("Invalid choice");
    }
}
}
