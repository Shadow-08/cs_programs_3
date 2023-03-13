import java.util.*;
import java.io.*;
public class txt
{
    public static void main(String[]args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        FileWriter on = new FileWriter("info.txt");
        BufferedWriter in = new BufferedWriter(on);
        PrintWriter x = new PrintWriter(in);
        System.out.println("enter the number of sentences");
        int n = sc.nextInt();
        String s = sc.nextLine();
        for(int i=0; i<n; i++)
        {
            System.out.println("enter the "+(i+1)+" sentence");
            s = sc.nextLine();
            x.println(s);
        }
        x.close();
    }
}