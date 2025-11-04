import java.util.Scanner;
class nthTerm
{
    public static void main(String args[])
    {
        float a,n,d,nterm;
        System.out.println("Enter a,n,d values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        n=sc.nextFloat();
        d=sc.nextFloat();
        nterm=a+(n-1)*d;
        System.out.println("nth term="+nterm);
        System.out.printf("nth term=%.2f",nterm);
    }
}