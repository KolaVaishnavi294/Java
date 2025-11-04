import java.util.*;
interface Base1
{
final double pi=3.14;
void area();
}
class Base2
{
protected int r;
public void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of the circle:");
r=s.nextint();
}
}
class Derived extends Base2 implements Base1
{
double area;
public void area()
{
area=pi*r*r;
System.out.println("Area of the circle is:",+area);
}
}
class Inheritance
{
public static void main(String args[])
{
Derived d=new Derived();
d.getdata();
d.area();
}
}