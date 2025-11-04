class Vehicle
{
    void start()
    {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive()
    {
        System.out.println("car is driving");
    }
}

public class S_Inheritnace3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Output: Vehicle is starting
        car.drive();  // Output: Car is driving
    }
}
