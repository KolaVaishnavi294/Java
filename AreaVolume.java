import java.util.Scanner;
class AreaVolume
{
    public static void main(String args[])
    {
        float r,r1,h,area,volume,area1,b1,b2,h1;
        System.out.println("Enter r value for sphere:");
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
        area=(float)(4*3.14*r*r);
        System.out.println("Area of sphere="+area);
        System.out.printf("Area of sphere=%.2f",area);
        System.out.println("\nEnter r1 and h value for cylinder:");
        r1=sc.nextFloat();
        h=sc.nextFloat();
        volume=(float)3.14*r1*r1*h;
        System.out.println("Volume of cylinder="+volume);
        System.out.printf("Volume of cylinder=%.2f",volume);
        System.out.println("\nEnter b1,b2,h1 value for trapezoid:");
        b1=sc.nextFloat();
        b2=sc.nextFloat();
        h1=sc.nextFloat();
        area1=(float)(1/2*(b1+b2)*h1);
        System.out.println("Area of Trapezoid="+area1);
        System.out.printf("Area of Trapezoid=%.2f",area1);
        
    }
}