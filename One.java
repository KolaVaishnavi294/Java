class One
{
int a,b;
void sum()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a and b values:");
a=s.nextInt();
b=s.nextInt();
int sum=a+b;
System.out.println("Sum of two numbers in the class'One' is :"+sum);
}
}
class Two extends One
{
int a=90,b=67;
int add;
void sum()
{
add=a+b;
System.out.println("Sum of numbers in the class 'Two' is:"+add);
}
}
class Poly
{
public static void main(String[] args)
{
One obj=new One();
obj.sum();
One t=new One();
t.sum();
}
}