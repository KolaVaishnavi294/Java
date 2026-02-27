public class TypeCast
{
    public static void main(String args[])
    {
        int x=15;
        float y;
        y=x;
        System.out.println(x);
        System.out.println(y);
        //Explicit
        double pi=3.1456;
        float pi_copy;
        pi_copy=(float)pi;
        System.out.println(pi);
        System.out.println(pi_copy);
    }
}