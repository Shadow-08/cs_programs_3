import java.util.*;
public class Transarray
{
    int arr[][], m, n;
    Transarray()
    {
        arr = new int[20][20];
        m = 0;
        n = 0;
    }
    Transarray(int mm, int nn)
    {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    public static void main(String[]args)
    {
        Transarray in = new Transarray(3, 3);
        in.fillarray();
        in.Transpose();
        in.displayarray();
    }
    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements for the array");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void Transpose()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = arr[j][i];
            }
        }
    }
    void displayarray()
    {
        System.out.println("Original Array :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the Array:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}