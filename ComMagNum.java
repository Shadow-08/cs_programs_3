import java.util.*;
public class ComMagNum
{
    int m, n;
    ComMagNum(int mm, int nn)
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
        if(a<b)
        {
            ComMagNum in = new ComMagNum(a, b);
            in.check();
        }
        else
            System.out.println("INVALID INPUT !!!!");
    }
    int composite(int x)
    {
        int c=0;
        for(int i=1; i<=x; i++)
        {
            if(x%i == 0)
                c++;
        }
        return c;
    }
    int magic(int x)
    {
        int s=x;
        while(s>9)
        {
            x=s; s=0;
            while(x>0)
            {
                int d = x%10;
                s += d; x /= 10;
            }
        }
        return s;
    }
    void check()
    {
        System.out.println("composite magic numbers :");
        for(int i=m; i<=n; i++)
        {
            if(composite(i) > 2 && magic(i) == 1)
                System.out.print(i+" ");
        }
    }
}