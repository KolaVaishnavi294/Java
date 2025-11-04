class A 
{
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

public class M_Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        C e1=new C();
        obj.display();
        e1.display();
         // Output: A's method
    }
}
