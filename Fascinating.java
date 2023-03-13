import java.util.*;
public class Fascinating
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of m");
        int m = sc.nextInt();
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        if(m<n && m>99 && m<10000 && n>99 && n<10000)
        {
            int c=0;
            for(int i=m; i<=n; i++)
            {
                int a = i*2, b = i*3, con;
                String num = "" + i + a + b;
                char ch;
                for(ch='1'; ch<='9'; ch++)
                {
                    con=0;
                    for(int j=0; j<num.length(); j++)
                    {
                        if(num.charAt(j) == ch)
                            con++;
                    }
                    if(con != 1)
                        break;
                }
                if(ch > '9')
                {
                    c++;
                    System.out.print(i+" ");
                }
            }
            if(c>0)
                System.out.println("\nFrequency = "+c);
        }
        else
            System.out.println("Invalid Input !!!!");
    }
}