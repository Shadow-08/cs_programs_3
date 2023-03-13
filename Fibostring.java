import java.util.*;
public class Fibostring
{
    String x, y, z;
    int n;
    Fibostring()
    {
        x = "";
        y = "";
        z = "";
        n = 0;
    }
    public static void main(String[]args)
    {
        Fibostring in = new Fibostring();
        in.accept();
        in.generate();
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        n = sc.nextInt();
        System.out.println("enter the first word");
        x = sc.next();
        System.out.println("enter the second word");
        y = sc.next();
    }
    void generate()
    {
        System.out.println("sequence :");
        System.out.print(x+" "+y+" ");
        for(int i=0; i<(n-2); i++)
        {
            z = y+x;
            System.out.print(z+" ");
            x=y; y=z;
        }
    }
}