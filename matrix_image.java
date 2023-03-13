import java.util.*;
public class matrix_image
{
    Scanner sc = new Scanner(System.in);
    int arr1[][], arr2[][], m, n; // data member initialisation
    matrix_image() // default constructor
    {
        arr1 = new int[15][15];
        arr2 = new int[15][15];
        m = 0;
        n = 0;
    }
    matrix_image(int mn, int nn) // parametrised constructor
    {
        m = mn;
        n = nn;
    }
    void acceptMat() // function for accepting elements of the array
    {
        arr1 = new int[m][n];
        System.out.println("enter elements for the array");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
    }
    void mirror_image() // function for storing second array with mirrored elements
    {
        arr2 = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=(n-1), k=0; j>=0; j--, k++)
            {
                arr2[i][k] = arr1[i][j];
            }
        }
    }
    void show() // function for printing the arrays
    {
        System.out.println("first array :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("mirrored array :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) // drive method
    {
        matrix_image in = new matrix_image(4, 4);
        in.acceptMat();
        in.mirror_image();
        in.show();
    }
}