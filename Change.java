import java.util.*;
public class Change
{
    static Scanner sc = new Scanner(System.in);
    long Dec[], Bin[], Oct[];
    String HexDec[];
    int n;
    Change()
    {
        Dec = null;
        Bin = null;
        Oct = null;
        HexDec = null;
        n = 0;
    }
    public static void main(String[]args)
    {
        Change in = new Change();
        System.out.println("enter 1 to convert decimal to binary");
        System.out.println("enter 2 to convert binary to decimal");
        System.out.println("enter 3 to convert decimal to octal");
        System.out.println("enter 4 to convert octal to decimal");
        System.out.println("enter 5 to convert decimal to hexa-decimal");
        System.out.println("enter 6 to convert hexa-decimal to decimal");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
                in.getlimit();
                in.inputdecimal();
                in.decimal_to_binary();
                break;

            case 2:
                in.getlimit();
                in.inputbinary();
                in.binary_to_decimal();
                break;
                
            case 3:
                in.getlimit();
                in.inputdecimal();
                in.decimal_to_octal();
                break;
                
            case 4:
                in.getlimit();
                in.inputoctal();
                in.octal_to_decimal();
                break;

            case 5:
                in.getlimit();
                in.inputdecimal();
                in.decimal_to_hexadecimal();
                break;

            case 6:
                in.getlimit();
                in.inputhexadecimal();
                in.hexadecimal_to_decimal();
                break;

            default : System.out.println("WRONG INPUT");
        }
    }
    void getlimit()
    {
        System.out.println("enter the limit");
        n = sc.nextInt();
        Dec = new long[n];
        Bin = new long[n];
        Oct = new long[n];
        HexDec = new String[n];
    }
    void inputdecimal()
    {
        System.out.println("enter elements for the decimal array");
        for(int i=0; i<n; i++)
        {
            Dec[i] = sc.nextLong();
        }
    }
    void inputbinary()
    {
        System.out.println("enter elements for the binary array");
        for(int i=0; i<n; i++)
        {
            Bin[i] = sc.nextLong();
        }
    }
    void inputoctal()
    {
        System.out.println("enter elements for the octal array");
        for(int i=0; i<n; i++)
        {
            Oct[i] = sc.nextLong();
        }
    }
    void inputhexadecimal()
    {
        System.out.println("enter elements for the hexadecimal array");
        for(int i=0; i<n; i++)
        {
            HexDec[i] = sc.next();
        }
    }
    void decimal_to_binary()
    {
        for(int i=0; i<n; i++)
        {
            long x = Dec[i], b=0, t=1;
            while(x>0)
            {
                long f = x%2;
                x /= 2;
                b += f*t;
                t *= 10;
            }
            System.out.println("binary equivalent of "+Dec[i]+" = "+b);
            System.out.println(b%10000);
        }
    }
    void binary_to_decimal()
    {
        for(int i=0; i<n; i++)
        {
            long x = Bin[i], d=0, t=0;
            while(x>0)
            {
                long f = x%10;
                d += f * Math.pow(2, t);
                x /= 10;
                t++;
            }
            System.out.println("decimal equivalent of "+Bin[i]+" = "+d);
        }
    }
    void decimal_to_octal()
    {
        for(int i=0; i<n; i++)
        {
            long x = Dec[i], o=0, t=1;
            while(x>0)
            {
                long f = x%8;
                x /= 8;
                o += f*t;
                t *= 10;
            }
            System.out.println("octal equivalent of "+Dec[i]+" = "+o);
        }
    }
    void octal_to_decimal()
    {
        for(int i=0; i<n; i++)
        {
            long x = Oct[i], d=0, t=0;
            while(x>0)
            {
                long f = x%10;
                d += f * Math.pow(8, t);
                x /= 10;
                t++;
            }
            System.out.println("decimal equivalent of "+Oct[i]+" = "+d);
        }
    }
    void decimal_to_hexadecimal()
    {
        long rem[] = new long[1000000];
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for(int i=0; i<n; i++)
        {
            int c=0;
            for(long j=Dec[i]; j>0; j/=16, c++)
            {
                rem[c] = j%16;
            }
            System.out.print("hexadecimal equivalent of "+Dec[i]+" = ");
            for(int j=(c-1); j>=0; j--)
            {
                for(int k=0; k<hex.length; k++)
                {
                    if(rem[j] == k)
                    {
                        System.out.print(hex[k]);
                    }
                }
            }
            System.out.println();
        }
    }
    void hexadecimal_to_decimal()
    {
        for(int i=0; i<n; i++)
        {
            char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            long d=0, t=0;
            for(int j=(HexDec[i].length()-1); j>=0; j--)
            {
                for(int k=0; k<hex.length; k++)
                {
                    if(HexDec[i].charAt(j) == hex[k])
                    {
                        d += k * Math.pow(16, t);
                        t++;
                    }
                }
            }
            System.out.println("decimal equivalent of "+HexDec[i]+" = "+d);
        }
    }
}