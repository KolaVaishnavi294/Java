class A {
    void display() {
        System.out.println("A's method");
    }
}

class B extends A {
    // B inherits A's method
}
class C extends A
{
    // C inherits A's method
}

public class S_Inheritance1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();  // Output: A's method
    }
}
