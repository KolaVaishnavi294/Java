public class DefaultValues
{
    byte b;
    int x;
    short s;
    long l;
    float f;
    double d; 
    char c;
    boolean bool;
    public static void main(String args[])
    {
        DefaultValues obj=new DefaultValues();
        System.out.println("Byte DefaultValues="+obj.b);
        System.out.println("Int DefaultValues="+obj.x);
        System.out.println("Short DefaultValues="+obj.s);
        System.out.println("Long DefaultValues="+obj.l);
        System.out.println("Float DefaultValues="+obj.f);
        System.out.println("Double DefaultValues="+obj.d);
        System.out.println("Char DefaultValues="+obj.c);
        System.out.println("Boolean DefaultValues="+obj.bool );
    }
}