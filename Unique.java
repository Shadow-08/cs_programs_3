import java.util.*;
public class Unique
{
    int n;
    Unique()
    {
        n = 0;
    }
    public static void main(String[]args)
    {
        Unique in = new Unique();
        in.readNum();
        in.display();
    }
    void readNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
    }
    int unique(int x)
    {
        int c=0;
        for(char ch='1'; ch<='9'; ch++)
        {
            c=0;
            String num = Integer.toString(x);
            for(int i=0; i<num.length(); i++)
            {
                if(num.charAt(i) == ch)
                    c++;
            }
            if(c > 1)
                break;
        }
        return c;
    }
    void display()
    {
        int x = unique(n);
        if(x <= 1)
            System.out.println("Unique Number");
        else
            System.out.println("Not An Unique Number");
    }
}