package ClassX;

import java.io.*;
public class AverageWords
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = new String();
        int c = 0, s = 0, k = 0;
        System.out.print("Enter Sentence: ");
        str = br.readLine();
        str = str.trim() + " ";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                c++;
                String w = str.substring(k, i);
                k = i + 1;
                s += w.length();
            }
        }
        System.out.println("The average of length of word(s) is " + (1.0*s/c));
    }
}