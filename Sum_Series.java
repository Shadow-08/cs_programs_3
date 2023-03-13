import java.util.*;
public class Sum_Series
{
    int x, n;
    double sum;
    Sum_Series()
    {
        x = 0;
        n = 0;
        sum = 0;
    }
    public static void main(String[]args)
    {
        Sum_Series in = new Sum_Series();
        in.readlimit();
        in.Sum();
    }
    void readlimit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        x = sc.nextInt();
        System.out.println("enter the limit");
        n = sc.nextInt();
    }
    void Sum()
    {
        for(int i=1; i<=n; i++)
        {
            sum += Math.pow(x, i*2)/Math.pow(i, i);
        }
        System.out.println("Sum = "+sum);
    }
}