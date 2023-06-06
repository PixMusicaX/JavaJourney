package ClassIX;

class ProfitLossPercent
//original name in copy(correction) is Buiessness
{public void calculate(double cp, double sp)
    {double p,l, pp, lp;
        if (sp > cp)
        {p = sp - cp;
            pp = p/cp*100;
            System.out.println("Your profit is " + p + " and it's percentage is " + pp);
        }
        else
        {l = cp - sp;
            lp = l/cp*100;
            System.out.println("Your loss is " + l + " and it's percentage is " + lp);
        }
    }
}