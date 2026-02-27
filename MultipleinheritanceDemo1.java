interface Flyable
{
    void fly();
}
interface Swimmable
{
    void swim();
}
interface Runnable
{
    void run();
}
class Bird implements Flyable,Runnable
{
    public void fly()
    {
        System.out.println("birds can fly");
    }
    public void run()
    {
        System.out.println("birds can run");
    }
}
class Fish implements Swimmable
{
    public void swim()
    {
        System.out.println("fish can swim");
    }
}
class Dog implements Swimmable,Runnable
{
    public void swim()
    {
        System.out.println("dog can swim");
    }
    public void run()
    {
        System.out.println("dog can run");
    }
}
public class  MultipleinheritanceDemo1
{ 
    public static void main(String args[])
    {
        Bird b=new Bird();
        b.fly();
        b.run();
        Fish f=new Fish();
        f.swim();
        Dog d=new Dog();
        d.run();
        d.swim();
    }
    
}