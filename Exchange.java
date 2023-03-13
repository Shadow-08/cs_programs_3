import java.util.*;
public class Exchange
{
    String sent, newstr; // data member initialisation
    int size; // data member initialisation
    Exchange() // default constructor
    {
        sent = "";
        newstr = "";
        size = 0;
    }
    public static void main(String[]args) // drive method
    {
        Exchange in = new Exchange();
        in.readsentence();
        in.NewWord();
        in.display();
    }
    void readsentence() // function for accepting a string and terminating program if not entered with a full stop
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence terminated with a full stop");
        sent = sc.nextLine();
        size = sent.length();
        if(sent.charAt(size-1) != '.')
        {
            System.out.println("the sentence is not terminated with a full stop");
            System.exit(0);
        }
    }
    void NewWord() // function for creating new word with consonants and vowels separated
    {
        for(int i=0; i<size; i++)
        {
            char ch = sent.charAt(i);
            if("aeiouAEIOU .".indexOf(ch) == -1)
            {
                newstr += ch;
            }
        }
        for(int i=0; i<size; i++)
        {
            char ch = sent.charAt(i);
            if("aeiouAEIOU.".indexOf(ch) != -1 && ch != ' ')
            {
                newstr += ch;
            }
        }
    }
    void display() // function for printing the sentence and new word
    {
        System.out.println("sentence : "+sent);
        System.out.println("word : "+newstr);
    }
}