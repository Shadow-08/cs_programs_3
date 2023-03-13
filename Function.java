import java.util.*;
public class Function
{
    int n, r; // data member initialisation
    double f; // data member initialisation
    Function() // default constructor
    {
        n = 0;
        r = 0;
        f = 0;
    }
    void readNum() // function for accepting a number and value of r
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        System.out.println("enter the value of r");
        r = sc.nextInt();
    }
    int factorial(int d) // function for calculating factorial
    {
        int x=1;
        for(int i=1; i<=d; i++)
        {
            x *= i;
        }
        return x;
    }
    void show() // function for printing result
    {
        f = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("result = "+f);
    }
    public static void main(String[]args) // drive method
    {
        Function in = new Function();
        in.readNum();
        in.show();
    }
}