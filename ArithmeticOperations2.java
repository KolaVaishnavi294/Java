public class ArithmeticOperations2
{
    public static void main(String[] args)
    {   
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]); 
        System.out.println("Addition:"+(x+y));
        System.out.println("Subration:"+(x-y));
        System.out.println("Multiplication:"+x*y);
        System.out.println("Division:"+x/y);
        System.out.println("Modulus:"+(x%y));
        float r=Float.parseFloat(args[2]);
        System.out.println("Area of circle="+(3.14*r*r));
        int p=Integer.parseInt(args[3]);
        int t=Integer.parseInt(args[4]);
        int r1=Integer.parseInt(args[5]); 
        System.out.println(((p*t*r1)/100));
    }
}