import java.util.*;
public class matrix_operation
{
    Scanner sc = new Scanner(System.in);
    int ar[][] = new int[10][10], m, n, x; // data member initialisation
    public static void main(String[]args) // drive method
    {
        matrix_operation in = new matrix_operation();
        in.getrowcolumn();
        in.getmatrix();
        in.print_mat_and_sum();
        in.change_diagonal();
    }
    void getrowcolumn() // function for accepting number of rows and colums
    {
        System.out.println("enter the order of the array");
        m = sc.nextInt();
        n = sc.nextInt();
    }
    void getmatrix() // function for accepting elements of the array
    {
        System.out.println("enter elements for the array");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
    }
    void print_mat_and_sum() // function for printing array elements followed by row wise sum
    {
        System.out.println("array :");
        for(int i=0; i<m; i++)
        {
            int s=0;
            for(int j=0; j<n; j++)
            {
                System.out.print(ar[i][j] + " ");
                s += ar[i][j];
            }
            System.out.println(s);
        }
    }
    void change_diagonal() // function for changing elements of the diagonals to x
    {
        System.out.println("enter the value of x");
        x = sc.nextInt();
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i == j || i+j == (n-1))
                {
                    ar[i][j] = x;
                }
            }
        }
        System.out.println("array after changing diagonals:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}