public class Square
{
    int num; // data member initialisation
    Square() // default constructor
    {
        num = 0;
    }
    Square(int nm) // parametrised constructor
    {
        num = nm;
    }
    public static void main(String[]args) // drive method
    {
        Square in = new Square(27);
        in.PerfectSquare();
        in.sequence();
    }
    void PerfectSquare() // function for printing perfect squares for 5 greater integers than num
    {
        System.out.println("perfect squares :");
        for(int i=num; i<=(num+5); i++)
        {
            System.out.println(i*i);
        }
    }
    void sequence() // function for printing consecutive integers that add up to num
    {
        System.out.println("sum of consecutive integers :");
        int s, t;
        for(int i=1; i<num; i++)
        {
            for(int j=i; j<=num; j++)
            {
                s=0;
                for(int k=i; k<=j; k++)
                {
                    s += k;
                }
                if(s == num)
                {
                    for(t=i; t<=j; t++)
                    {
                        System.out.print(t+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}