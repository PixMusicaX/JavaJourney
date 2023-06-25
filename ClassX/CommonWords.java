package ClassX;

//program 8
//accept two Strings and find the common words between them
//Note: String works on index not on position
import java.io.*;
public class CommonWords
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = new String();// first String
        String b = new String();// second String
        String aw = new String();// for word extraction of a
        String bw = new String();//for word extraction of b
        char c1;//for letter extraction of a
        char c2;//for letter extraction of b
        int k1 = 0;//helps in word extraction
        int k2 = 0;//helps in word extraction
        boolean flag = false;// if no common words are found
        System.out.print("Enter the first String: ");
        a = br.readLine().trim();// taking input the first String
        System.out.print("Enter the second String: ");
        b = br.readLine().trim();// taking input the second String
        a = a + " ";
        b = b + " ";
        /*The method of extracting word from one String then exracting all the words
        of the other String and matchong has been used in the process given below*/
        System.out.println("The Common word(s) are: ");
        for(int i = 0; i < a.length(); i++)
        {
            c1 = a.charAt(i);
            if(c1 == ' ')
            {
                aw = a.substring(k1, i);
                k1 = i + 1;
                k2 = 0;
                for(int j = 0; j < b.length(); j++)
                {
                    c2 = b.charAt(j);
                    if(c2 == ' ')
                    {
                        bw = b.substring(k2, j);
                        k2 = j + 1;
                        if(aw.equalsIgnoreCase(bw))
                        {
                            System.out.println(aw);
                            flag = true;
                        }
                    }
                }
            }
        }
        if(flag == false)
         System.out.println("NONE");
    }
}
        
        