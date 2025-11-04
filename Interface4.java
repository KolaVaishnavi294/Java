interface I1
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("This is default method");
    }
}
class C1 implements I1{
    public void m1()
    {
        System.out.println("M1 method");
    }
    public void m2()
    {
        System.out.println("M2 method");
    }
    public void m3()
    {
        System.out.println("overrided method");
    }
}
class C2 implements I1{
    public void m1()
    {
        System.out.println("M1 method");
    }
    public void m2()
    {
        System.out.println("M2 method");
    }
}
public class Interface4 
{
    public static void main(String[] args)
    {
        I1 i=new C1();
        i.m1();
        i.m2();
        i.m3();

        i=new C2();
        i.m1();
        i.m2();
        i.m3();
    }
}