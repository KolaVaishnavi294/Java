public class TestThis
{
    int x;
	public TestThis()
	{
	   x=10;
	}
	public TestThis(int x)
	{
	   this.x=x;
	}
	public static void main(String args[])
	{
	   TestThis t1=new TestThis();
	   TestThis t2=new TestThis(20);
	   System.out.println(t1.x);
	   System.out.println(t2.x);
	}
}
