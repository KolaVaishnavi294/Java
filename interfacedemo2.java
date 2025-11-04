interface Animal
{
    public void sound();
    public void eat();
    
}
class Dog implements Animal
{
    public void sound()
    {
        System.out.println("dog makes sound");
    }
    public void eat()
    {
        System.out.println("dog can eat meat");
    }
    public void guard()
    {
        System.out.println("dog will protects");
    }
}
class cow implements Animal
{
    public void sound()
    {
        System.out.println("cow makes sound");
    }
    public void eat()
    {
        System.out.println("cow eats");
    }
}
class tiger implements Animal
{
    public void sound()
    {
        System.out.println("tiger sounds");
    }
    public void eat()
    {
        System.out.println("tiger eats");
    }
}
public class interfacedemo2
{
    public static void main(String args[])
    {
        Animal a;
        a=new Dog();
        System.out.println("currently parent reference");
        a.sound();
        a.eat();
        
        a=new cow();
        System.out.println("currently parent reference");
        a.sound();
        a.eat();
        
        a=new tiger();
        System.out.println("currently parent reference");
        a.sound();
        a.eat();
    }
}