import java.util.*;
public class Pseudoarithmetic
{
    static Scanner sc = new Scanner(System.in);
    int n, a[], sum;
    boolean ansflag;
    Pseudoarithmetic()
    {
        n = 0;
        a = null;
        sum = 0;
        ansflag = false;
    }
    public static void main(String[]args)
    {
        Pseudoarithmetic in = new Pseudoarithmetic();
        System.out.println("enter the limit");
        int x = sc.nextInt();
        in.accept(x);
        if(in.check() == true)
        {
            System.out.println("it is a Pseudo-Arithmetic sequence");
        }
        else
        {
            System.out.println("it is not a Pseudo-Arithmetic sequence");
        }
    }
    void accept(int nn)
    {
        n = nn;
        a = new int[n];
        System.out.println("enter elements for the array :");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
    }
    boolean check()
    {
        int l = a.length;
        if(l%2 == 0)
        {
            int m = l/2;
            for(int i=0; i<m; i++)
            {
                sum += a[i] + a[l-(i+1)];
            }
            if(sum == ((a[0] + a[l-1]) * m))
            {
                ansflag = true;
            }
        }
        else
        {
            int m = (int) Math.ceil((double)l/2);
            for(int i=0; i<m; i++)
            {
                if(i < (m-1))
                {
                    sum += a[i] + a[l-(i+1)];
                }
                else
                {
                    sum += a[m-1] + a[m-1];
                }
            }
            if(sum == ((a[0] + a[l-1]) * m))
            {
                ansflag = true;
            }
        }
        return ansflag;
    }
}