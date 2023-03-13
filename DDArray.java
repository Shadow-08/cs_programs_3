import java.util.*;
public class DDArray
{
    Scanner sc = new Scanner(System.in);
    int mat[][] = new int[50][50], m, n; // data member initialisation
    DDArray(int nr, int nc) // parameterised constructor
    {
        m = nr;
        n = nc;
    }
    public static void main(String[]args) // drive method
    {
        DDArray in = new DDArray(4, 4);
        in.readMatrix();
        in.Sums();
        in.show_Mats();
    }
    void readMatrix() // function for accepting elements of the array
    {
        System.out.println("enter elements for the array");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    void Sums() // function for calculating and printing the sums of the right and left diagonals and also boundary elements
    {
        int s1=0, s2=0, s3=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i == j)
                {
                    s1 += mat[i][j];
                }
                if(i+j == (n-1))
                {
                    s2 += mat[i][j];
                }
                if(i == 0 || i == (n-1) || j== 0 || j == (n-1))
                {
                    s3 += mat[i][j];
                }
            }
        }
        System.out.println("sum of right diagonal = "+s2);
        System.out.println("sum of left diagonal = "+s1);
        System.out.println("sum of boundary elements = "+s3);
    }
    void show_Mats() // function for printing the array and inner elements
    {
        System.out.println("array :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("inner elements :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i == 0 || i == (n-1) || j== 0 || j == (n-1))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}