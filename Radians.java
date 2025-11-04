import java.util.Scanner;
class Radians
{
    public static void main(String args[])
    {
        float degree,radians;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        degree=sc.nextFloat();
        radians=(float)(degree*3.14/180);
        System.out.println("Radians="+radians);
        System.out.printf("Radians=%.2f",radians);
    }
}