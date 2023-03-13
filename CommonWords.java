import java.util.*;
public class CommonWords
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two sentences");
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        String w1[] = s1.split(" "), w2[] = s2.split(" ");
        for(int i=0; i<w1.length; i++){
            int c=0;
            for(int j=0; j<w2.length; j++)
                if(w1[i].equalsIgnoreCase(w2[j]))
                    c++;
            if(c>0){
                for(int j=0; j<w2.length; j++)
                    if(w1[i].equalsIgnoreCase(w2[j]))
                        c++;
                System.out.println("number of times "+w1[i]+" repeated = "+c);
            }
        }
    }
}