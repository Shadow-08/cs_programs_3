import java.util.*;
public class HamDis
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m>0 && n>0)
        {
            int a=m, b=n, c=0;
            String x = "", y = "";
            while(a>0)
            {
                int d = a%2;
                x += Integer.toString(d);
                a /= 2;
            }
            while(b>0)
            {
                int d = b%2;
                y += Integer.toString(d);
                b /= 2;
            }
            if(x.length() > y.length())
            {
                int d = x.length() - y.length();
                String z = "";
                for(int i=0; i<d; i++)
                {
                    z += "0";
                }
                y = z+y;
            }
            else if(x.length() < y.length())
            {
                int d = y.length() - x.length();
                String z = "";
                for(int i=0; i<d; i++)
                {
                    z += "0";
                }
                x = z+x;
            }
            for(int i=0; i<x.length(); i++)
            {
                if(x.charAt(i) != y.charAt(i))
                {
                    c++;
                }
            }
            System.out.println("Binary Equivalent of "+m+" = "+x);
            System.out.println("Binary Equivalent of "+n+" = "+y);
            System.out.println("Hamming Distance = "+c);
        }
        else
        {
            System.out.println("Invalid Input!!!");
        }
    }
}