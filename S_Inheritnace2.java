class A
{
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class S_Inheritnace2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  	// Output: Animal is eating
        dog.bark(); 	// Output: Dog is barking
    }
}