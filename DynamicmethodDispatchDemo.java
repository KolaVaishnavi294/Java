class Animal
{
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sound() {
        System.out.println("Animal makes sounds");
    }
}
class Dog extends Animal
{   
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}
class Tiger extends Animal
{   
    @Override
    public void sound() {
        System.out.println("Tiger is roaring");
    }
}
public class DynamicmethodDispatchDemo {
    public static void main(String[] args)
    {   
        Animal a=new Animal();
        a.eat();
        a.sound();

        a=new Dog();            //Dog d = new Dog();
        a.eat();  	// Output: Animal is eating
        a.sound(); 	// Output: Dog is barking

        a=new Tiger();  //Tiger t=new Tiger();
        a.eat();
        a.sound();
    }
}