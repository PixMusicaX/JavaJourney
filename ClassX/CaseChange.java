package ClassX;

import java.io.*;
class CaseChange
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = new String();
        String s = new String();
        System.out.print("Enter the String: ");
        str = br.readLine();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
             s = s + Character.toLowerCase(ch);
            else if(Character.isLowerCase(ch))
             s = s + Character.toUpperCase(ch);
            else
             s = s + ch;
        }
        System.out.print("The String in reverse case is " + s);
    }
}