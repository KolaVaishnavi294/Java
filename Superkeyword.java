class A
{
int i,j;
A()
{
i=0;
j=0;
}
A(int a,int b)
{
i=a;
j=b;
}
void show()
{
System.out.println("i and j:"+i+" "+j);
}
}
class B extends A
{ 
int k;
B()
{
super();
k=0;
}
B(int a,int b,int c)
{
super(a,b);
k=c;
}
void show()
{
super.show();
System.out.println("k:"+k);
}
}
public class Superkeyword
{
public static void main(String args[])
{
B subob=new B(1,2,3);
subob.show();
}
}