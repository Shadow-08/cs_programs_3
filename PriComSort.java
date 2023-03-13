import java.util.*;
public class PriComSort
{
    static Scanner sc = new Scanner(System.in);
    int arr[], pri[], com[], m, p, c;
    PriComSort(int mm)
    {
        m = mm;
        p = 0;
        c = 0;
        arr = new int[m];
        pri = new int[m];
        com = new int[m];
    }
    public static void main(String[]args)
    {
        System.out.println("enter the size of the array");
        int x = sc.nextInt();
        PriComSort in = new PriComSort(x);
        in.read();
        in.bsort();
        in.prime_composite_sort();
        in.display();
    }
    void read()
    {
        
    }
    void bsort()
    {
        
    }
    void prime_composite_sort()
    {
        
    }
    void display()
    {
        
    }
}