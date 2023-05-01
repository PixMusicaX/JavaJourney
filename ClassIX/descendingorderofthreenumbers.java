package ClassIX;

class descendingorderofthreenumbers
{public void display(int a, int b, int c)
    {int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a, Math.min(b,c));
        int mid = a + b+ c - max - min;
        System.out.println("The descending order is: " + max + " > " + mid + " > " + min);
    }
}