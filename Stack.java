import java.util.*;
public class Stack
{
    int arr[], m, sp;
    Stack(int mm)
    {
        m = mm;
        arr = new int[m];
        sp = -1;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m");
        int t = sc.nextInt();
        Stack in = new Stack(t);
        while(true)
        {
            System.out.println("Enter 1 to PUSH");
            System.out.println("Enter 2 to POP");
            System.out.println("Enter 3 to PEEK");
            System.out.println("Enter 4 to DISPLAY");
            int x = sc.nextInt();
            switch(x)
            {
                case 1:
                    System.out.println("Enter the number");
                    int n = sc.nextInt();
                    in.PUSH(n);
                    break;

                case 2:
                    in.POP();
                    break;

                case 3:
                    in.PEEK();
                    break;

                case 4:
                    in.DISPLAY();
                    break;

                default: System.out.println("WRONG INPUT !!!!");
            }
            System.out.println("Enter 'yes' if you want to continue");
            String s = sc.next();
            if(!(s.equalsIgnoreCase("yes")))
                break;
        }
    }
    void PUSH(int x)
    {
        if(sp == m-1)
            System.out.println("Stack Overflow !!!!");
        else
        {
            sp++;
            arr[sp] = x;
        }
    }
    void POP()
    {
        if(sp == -1)
            System.out.println("Stack Underflow !!!!");
        else
            sp--;
    }
    void PEEK()
    {
        System.out.println("Last Element = "+arr[sp]);
    }
    void DISPLAY()
    {
        System.out.println("Stack :");
        for(int i=sp; i>=0; i--)
            System.out.println(arr[i]);
    }
}