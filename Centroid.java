import java.util.Scanner;
class Centroid
{
    public static void main(String args[])
    {
        float x1,x2,x3,y1,y2,y3,c,c1;
        System.out.println("Enter x1,x2,x3,y1,y2,y3 values:");
        Scanner sc=new Scanner(System.in);
        x1=sc.nextFloat();
        x2=sc.nextFloat();
        x3=sc.nextFloat();
        y1=sc.nextFloat();
        y2=sc.nextFloat();
        y3=sc.nextFloat();
        c=(x1+x2+x3)/3;
        c1=(y1+y2+y3)/3;
        System.out.println("Centroid=("+c+","+c1+")");
        System.out.printf("Centroid=(%.2f,%.2f)",c,c1);
    }
}