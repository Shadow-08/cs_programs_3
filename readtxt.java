import java.io.*;
import java.util.*;
public class readtxt
{
    public static void main(String[]args) throws IOException
    {
        FileReader on = new FileReader("info.txt");
        BufferedReader in = new BufferedReader(on);
        String s;
        while((s = in.readLine()) != null)
        {
            StringTokenizer x = new StringTokenizer(s);
            int n = x.countTokens();
            System.out.println(s+" : "+n+" words");
        }
    }
}