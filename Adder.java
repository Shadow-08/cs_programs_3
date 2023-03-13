import java.util.*;
public class Adder
{
    int a[] = new int[2];
    Adder()
    {
        a[0] = 0;
        a[1] = 0;
    }
    public static void main(String[]args)
    {
        Adder in = new Adder();
        Adder on = new Adder();
        in.readTime();
        on.readTime();
        Adder sum = new Adder();
        sum.addTime(in, on);
        sum.dispTime();
    }
    void readTime()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the hour");
        a[0] = sc.nextInt();
        System.out.println("enter the minute");
        a[1] = sc.nextInt();
    }
    void addTime(Adder x, Adder y)
    {
        a[0] = x.a[0] + y.a[0];
        a[1] = x.a[1] + y.a[1];
        if(a[1] > 60)
        {
            a[1] -= 60; a[0]++;
        }
    }
    void dispTime()
    {
        System.out.println("time = "+a[0]+":"+a[1]);
    }
}