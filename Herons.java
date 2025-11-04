import java.util.Scanner;
class HeronsArea
{
    public static void main(String args[])
    {
        float a,b,c,s,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c values:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        area=(float)Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area of triangle="+area);
        System.out.printf("Area of triangle=%.0f",area);
    }
}