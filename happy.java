import java.util.*;
public class happy
{
    int n; // data member initialisation
    happy() // default constructor
    {
        n = 0;
    }
    public static void main(String[]args) // drive method
    {
        happy in = new happy();
        in.getnum();
        in.isHappy();
    }
    void getnum() // function for accepting a number
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
    }
    int sum_sqr_digits(int d) // function for calculating eventual sum
    {
        int s = d;
        while(s>1 && n>9)
        {
            d=s; s=0;
            while(d>0)
            {
                s += d%10 * d%10;
                d /= 10;
            }
        }
        return s;
    }
    void isHappy() // function for printing whether it is a happy number or not
    {
        if(sum_sqr_digits(n) == 1)
        {
            System.out.println("happy number");
        }
        else
        {
            System.out.println("not a happy number");
        }
    }
}