class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    public void sound()
    {
        System.out.println("Animal makes sounds");
    }
}
class dog extends Animal{
    public void guard()
    {
        System.out.println("dog is guarding");
    }
    @Override
    public void sound()
    {
        System.out.println("Bow bow");
    }
}
public class Methodoverriding
{
 public static void main(String args[])
{
  dog obj=new dog();
  obj.eat();
  obj.sound();
  obj.guard();
}
}