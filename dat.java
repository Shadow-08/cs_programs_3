import java.io.*;
import java.util.*;
public class dat
{
    public static void main(String[]args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        FileOutputStream on = new FileOutputStream("invoice.dat");
        DataOutputStream in = new DataOutputStream(on);
        System.out.println("enter the number of items");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("enter the name of the item");
            String N = sc.next();
            System.out.println("enter the quantity");
            double Q = sc.nextDouble();
            System.out.println("enter the price");
            double P = sc.nextDouble();
            in.writeUTF(N);
            in.writeDouble(Q);
            in.writeDouble(P);
        }
        on.close();
        in.close();
    }
}