import java.util.Scanner;
class Slope
{
    public static void main(String args[])
    {
        float x1,x2,y1,y2,slope;
        System.out.println("Enter 5 numbers:");
        Scanner sc=new Scanner(System.in);
        x1=sc.nextFloat();
        x2=sc.nextFloat();
        y1=sc.nextFloat();
        y2=sc.nextFloat();
        slope=(y2-y1)/(x2-x1);
        System.out.println("Slope="+slope);
        System.out.printf("Slope=%.2f",slope);
    }
}