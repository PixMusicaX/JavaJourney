package ClassIX;

//First 100 calls are rupees 0.70 per call, next 100 calls are rupees 0.60 per call and above 200 calls-
//cost rupees 0.50 per call
class Phonecall
{double p;
    public void calculate(int c)
    {if (c <= 100)
        p = c * 0.70;
        else if (c <= 200)
        p = 70 + (c - 100)* 0.60;
        else
        p = 130 - (c - 200)* 0.50;
     double k = p * 1.00 ;
        System.out.println("The balance required for the calls are: Rupees " + k);
    }
}