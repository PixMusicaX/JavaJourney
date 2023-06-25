package ClassX;

//program 10
//menu based program using switch case
//convert number from decimal to binary and vice versa
import java.io.*;
public class Conversion
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch;// for taking input the choice
        String s = new String();// for taking input the number/ for binary calculation
        int n;//for converting String to int/calculating decimal equivalent
        int c;//copy variable/binary number extraction
        System.out.println("Enter\n1.Decimal to Binary\n2.Binary to Decimal");
        System.out.print("Enter your choice: ");
        ch = Integer.parseInt(br.readLine());// taking input the choice
        switch(ch)
        {
            case 1:
            System.out.print("Enter the number: ");
            s = br.readLine();// taking input the number
            n = Integer.parseInt(s);//converting String to number
            c = n;
            s = "";//reinitializing for binary calculation
            while(c != 0)//calculating binary equivalent
            {
                s = s + (c % 2);
                c /= 2;
            }
            System.out.println("Binary Equivalent: " + s);
            break;
            
            case 2:
            System.out.print("Enter the number: ");
            s = br.readLine();// taking input the number
            n = 0;// for calculation
            int k = 0;
            for(int i = s.length() - 1; i > 1; i--)
            {
                char ex = s.charAt(i);
                c = ex - '0';
                n += c * (int)Math.pow(2,k);
                k++;
            }
            System.out.println("Decimal Equivalent: " + n);
            break;
            
            default:// if input is wrong/not specified
            System.out.print("Wrong Input!");
        }
    }/* end of main*/    }/*end of class*/
