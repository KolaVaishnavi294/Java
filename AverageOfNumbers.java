import java.util.Scanner;
class AverageOfNumbers
{
    public static void main(String args[])
    {
        float a,b,c,d,e,average;
        System.out.println("Enter 5 numbers:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=sc.nextFloat();
        e=sc.nextFloat();
        average=(float)((a+b+c+d+e)/5);
        System.out.println("Average of Numbers="+average);
        System.out.printf("Average of Numbers=%.2f",average);
    }
}