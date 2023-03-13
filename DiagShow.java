import java.util.*;
public class DiagShow
{
    static Scanner sc = new Scanner(System.in);
    int A[][], M;
    DiagShow()
    {
        A = null;
        M = 0;
    }
    DiagShow(int mm)
    {
        M = mm;
        A = new int[M][M];
    }
    public static void main(String[]args)
    {
        System.out.println("enter the value of M");
        int x = sc.nextInt();
        if(x>2 && x<10)
        {
            DiagShow in = new DiagShow(x);
            in.read();
            in.show();
            in.upper();
            in.lower();
        }
    }
    void read()
    {
        System.out.println("enter elements for the array");
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<M; j++)
                A[i][j] = sc.nextInt();
        }
    }
    void show()
    {
        System.out.println("Original Array :");
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<M; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
    void upper()
    {
        System.out.println("Upper Diagonal Array Elements:");
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(i+j <= M-1)
                    System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    void lower()
    {
        System.out.println("Lower Diagonal Array Elements:");
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(i+j > M-1)
                    System.out.print(A[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}