package ClassIX;

class Employee
{String name;
    double basic,da,hra,gross;
    public void accept(String n, double b)
    {name = n;//initialising name
        basic = b;//initialising basic
    }
    public void calculate()
    {da = basic*0.4;//calculating basic
        hra = Math.min(5000,basic*15.0/100);//calculating hra
        gross = basic + da + hra;//calculating gross
    }
    public void show()
    {System.out.println("Your name is :" + name);
    System.out.println("Your gross salary is: " + gross);
}
}