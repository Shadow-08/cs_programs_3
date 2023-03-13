import java.util.*;
public class PrimeFact
{
    int num, sum;
    PrimeFact()
    {
        num =0;
        sum = 0;
    }
    public static void main(String[]args)
    {
        PrimeFact in = new PrimeFact();
        in.Accept();
        in.generateFacts();
        in.print();
    }
    void Accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num = sc.nextInt();
    }
    void generateFacts()
    {
        int x = num, d=2;
        System.out.print("prime factors = ");
        while(x>1)
        {
            if(x%d == 0)
            {
                System.out.print(d+" ");
                sum += d;
                x /= d;
            }
            else
            {
                d++;
            }
        }
        System.out.println();
    }
    void print()
    {
        System.out.println("NUMBER = "+num);
        System.out.println("SUM = "+sum);
    }
}