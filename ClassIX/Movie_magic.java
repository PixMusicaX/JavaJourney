package ClassIX;

class Movie_magic
{String name;
    double rating;
    public void accept(String n, double r)
    {name = n;//initialising name
        rating = r;//initialising rating
    }
    public void calculate()
    {System.out.println("The movie name is " + name);//displaying name
        if(rating >= 0 && rating <= 2.0)
        System.out.println("This movie is flop");
        else if (rating <= 3.4)
        System.out.println("This movie is a semi-hit");
        else if (rating <=4.5)
        System.out.println("This movie is a hit");
        else if(rating <= 5.0)
        System.out.println("This movie is a blockbuster");
        //original statement in copy is "Super Hit"
        else
        System.out.println("This movie is not worth seeing");
        //my addition to this program
    }
}
        