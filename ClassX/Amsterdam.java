package ClassX;

import java.util.*;
class Amsterdam
{int independent(String b, String s)
    {String st = "";
        int c = 0;
        for(int i = 0; i < b.length(); i++)
        {if(b.charAt(i) == ' ')
            {if(st.equals(s))
                {c++;
                 st = "";
                }
             else
              {st = st + b.charAt(i);
               }
            }
        }
        return c;
    }
    
    int part(String b, String s)
    {int c = 0;
        int k = s.length();
        for(int i = 0 ; i < b.length() - k + 1;i++)
        if(b.substring(i, i + k).equals(s))
          c++;
     return c;
    }
  
    public static void main(String args[])
    {String a, b;
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter smaller String: ");
        a = sc.nextLine().toUpperCase();
        System.out.print("Enter larger String: ");
        b = sc.nextLine().toUpperCase();
        b = b.trim() + ' ';
        Amsterdam ob = new Amsterdam();
        l = ob.independent(b , a);
        System.out.println("As Independent word, " + a + " is present " + l + " times");
        l = ob.part(b , a);
        System.out.println("As part of the word, " + a + " is present " + l + " times");
    }
} 