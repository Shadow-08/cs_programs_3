import java.util.*;
public class amicable
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), s1=0, s2=0;
        for(int i=1; i<=n1; i++)
        {
            if(n1%i == 0)
            {
                s1 += i;
            }
        }
        for(int i=1; i<=n2; i++)
        {
            if(n2%i == 0)
            {
                s2 += i;
            }
        }
        if(s1 == s2)
        {
            System.out.println("amicable number");
        }
        else
        {
            System.out.println("not an amicable number");
        }
    }
}