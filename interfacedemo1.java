interface interfacedemo1
{
    public void method1();
    public void method2();
    
}
 class Test implements interfacedemo1
{
    public void method1()
    {
        System.out.println("This is method1");
    }
    public void method2()
    {
        System.out.println("This is method2");
    }
}
class Mainclass
{
    public static void main(String args[])
    {
       interfacedemo1 i1=new Test();
       i1.method1();
       i1.method2();
    }
}