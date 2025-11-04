import java.util.Scanner;
class PythagoreanTheorem
{
    public static void main(String args[])
    {
        float s1,s2,hypotenuse;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextFloat();
        s2=sc.nextFloat();
        hypotenuse=(float)Math.sqrt((s1*s1)+(s2*s2));
        System.out.println("Hypotenuse="+hypotenuse);
        System.out.printf("Hypotenuse=%.2f",hypotenuse);
    }
}