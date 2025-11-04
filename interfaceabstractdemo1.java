interface inf1
{
    void m1();
    default void m2()
    {
        System.out.println("This is default");
    }
    static void m3()
    {
        System.out.println("This is static method");
    }
}
class test implements inf1
{
    public void m1()
    {
        System.out.println("This is abstract method");
    }
}
public class interfaceabstractdemo1
{
    public static void main(String args[])
    {
        test t=new test();
        t.m1();
        t.m2();
        //t.m3();
        inf1.m3();
    }
}