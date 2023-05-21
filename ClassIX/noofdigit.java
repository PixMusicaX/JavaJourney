package ClassIX;

class noofdigit
{//'noofdogit' is the code name of "no. of digit"
    //this code emplies for positive numbers only.
public void display(int n)
{if (n < 10)
    System.out.println(n + " is a 1 digit number");
    else if (n < 100)
    System.out.println(n + " is a 2 digit number");
    else if (n < 1000)
    System.out.println(n + " is a 3 digit number");
    else if (n < 10000)
    System.out.println(n + " is a 4 digit number");
    else if (n < 100000)
    System.out.println(n + " is a 5 digit number");
    else if (n < 1000000)
    System.out.println(n + " is a 6 digit number");
    else if (n < 10000000)
    System.out.println(n + " is a 7 digit number");
    else if (n > 9999999)
    System.out.println(n + " is a long digit number");
    else
    System.out.println(n + " is a no digit number");
}
}