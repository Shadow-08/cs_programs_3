import java.util.*;
public class SmallSum
{
    int m, n;
    SmallSum(int mm, int nn)
    {
        m = mm;
        n = nn;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of m");
        int a = sc.nextInt();
        System.out.println("enter the value of n");
        int b = sc.nextInt();
        if(a>100 && a<10000 && b<100)
        {
            SmallSum in = new SmallSum(a, b);
            in.check();
        }
        else
            System.out.println("INVALID INPUT!!!!");
    }
    void check()
    {
        for(int i=m; i<10000; i++)
        {
            int x=i, sum=0, c=0;
            while(x>0)
            {
                int digit = x%10;
                sum += digit;
                x/=10; c++;
            }
            if(sum == n)
            {
                System.out.println("smallest integer adding up to n = "+i);
                System.out.println("number of digits = "+c);
                break;
            }
        }
    }
}