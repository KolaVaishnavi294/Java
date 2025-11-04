import java.util.Scanner;
class ArithmeticSeries
{
    public static void main(String args[])
    {
        int n,a,l,Sn;
        System.out.println("Enter a,n,d values:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=sc.nextInt();
        l=sc.nextInt();
        Sn=n/2*(a+l);
        System.out.println("Arithmetic Series="+Sn);
        System.out.printf("Arithmetic Series=%d",Sn);
        sc.close();
    }
}