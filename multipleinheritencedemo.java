interface i1
{
    void wish();
    void message();
}
interface i2
{
    void wish();
    void reply();
}
class Test implements i1,i2
{
    public void wish()
    {
         System.out.println("HELLO");
    }
    public void message()
    {
        System.out.println("DON't Message");
    }
    public void reply()
    {
        System.out.println("Give REPLY");
    }
}
public class multipleinheritencedemo
{
   public static void main(String args[])
   {
       Test t=new Test();
       t.wish();
       t.message();
       t.reply();
   }
}