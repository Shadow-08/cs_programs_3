import java.util.*;
public class Strength
{
    String st, Str;
    Strength()
    {
        st = "";
        Str = "";
    }
    public static void main(String[]args)
    {
        Strength in = new Strength();
        in.readStr();
        in.show();
        in.Potential();
    }
    void readStr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        st = sc.nextLine();
        Str = st.toUpperCase();
    }
    void show()
    {
        System.out.println("original sentence = "+st);
        System.out.println("sentence in upper case = "+Str);
    }
    void Potential()
    {
        int l = Str.length(), t=0;
        System.out.println("WORD\tPOTENTIAL");
        for(int i=0; i<l; i++)
        {
            int sum=0;
            if(Str.charAt(i) == ' ')
            {
                String s = Str.substring(t, i);
                for(int j=t; j<i; j++)
                {
                    sum += (int) Str.charAt(j) - 64;
                }
                System.out.println(s + "\t" + sum);
                t = i+1;
            }
            else if(i == l-1)
            {
                String s = Str.substring(t, l);
                for(int j=t; j<l; j++)
                {
                    sum += (int) Str.charAt(j) - 64;
                }
                System.out.println(s + "\t" + sum);
            }
        }
    }
}