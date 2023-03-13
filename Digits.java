public class Digits
{
    int num, p, s; // data member initialisation
    Digits() // default constructor
    {
        num = 0;
        p = 1;
        s = 0;
    }
    Digits(int nx) // parameterised constructor
    {
        num = nx;
    }
    public static void main(String[]args) // drive method
    {
        Digits on = new Digits(190706);
        on.extraction();
        on.display();
    }
    void extraction() // function for calculating the product of the first and last digits and sum of the remaining digits
    {
        int x = num, n = num, d, c=0;
        p = 1;
        while(x>0)
        {
            c++;
            x /= 10;
        }
        for(int i=1; i<=c; i++)
        {
            d = n%10;
            if(i == 1 || i == c)
            {
                p *= d;
            }
            else
            {
                s += d;
            }
            n /= 10;
        }
    }
    void display() // function for printing the product and sum
    {
        System.out.println("number = "+num);
        System.out.println("product of the first and last digits = "+p);
        System.out.println("sum of the remaining digits = "+s);
    }
}