package ClassIX;

class Fun
{public static boolean isPrime(int n)
    {int c = 0;
        for(int i = 1;i <=n;i++)
        if (n%i == 0)
        c++;
        if (c == 2)
        return true;
        return false;
    }
    
     public static int nextPrime(int n)
    {n++;
      while(true)
      {if (isPrime(n++))
          return n - 1;
    }
}
    
  public static boolean isPal(int n)
    {int c = n, d = 0;
        while(c != 0)
        {d = d * 10 + (c % 10);
            c /= 10;
        }
        return (d == n);
    }
    
    public static int Ascending_order(int n)//may be bugged(beta)
    {int c = n, r = 0, ch = 0, d;
        while (c!=0)
        {ch++;
            if (ch == 10)
            ch = 0;
            d = c % 10;
            if (d == ch)
            r = r * 10 + d;
            c = c/10;
        }
        return r;
    }
    
    public static int Freq(int n, int d)//may be bugged(beta)
    {int c = n, l, f = 0;
        while(c!=0)
        {l = c % 10;
            if(d == l)
            f++;
            c= c/10;
        }
        return f;
    }
            
    
    
}
    

    