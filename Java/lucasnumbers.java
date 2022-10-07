import java.util.*;
class lucasnumbers
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms until which you want to print the Lucas numbers : ");
        int n=sc.nextInt();
        int a=2;
        int b=1;
        System.out.print(a+","+b);
        for(int i=3;i<=n;i++)
        {
            int t=a+b;
            System.out.print(","+t);
            a=b;
            b=t;
        }
    }
}