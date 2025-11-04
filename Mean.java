import java.util.Scanner;
class Mean
{
    public static void main(String args[])
    {
        float a,b,c,d,e,f,mean;
        System.out.println("Enter 6 numbers:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=sc.nextFloat();
        e=sc.nextFloat();
        f=sc.nextFloat();
        mean=(a+b+c+d+e+f)/6;
        System.out.println("Mean="+mean);
        System.out.printf("Mean=%.2f",mean);
    }
}