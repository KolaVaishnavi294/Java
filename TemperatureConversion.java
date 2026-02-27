import java.util.Scanner;
class TemperatureConversion
{
    public static void main(String args[])
    {
        float c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value in celsius: ");
        c=sc.nextFloat();
        f=(c*9/5)+32;
        System.out.println("Farenheit="+f);
        System.out.printf("Farenheit= %.0f",f);
    }
}