public class Person
{
    // Private field
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name){
        this.name = name;
    }

    // Getter method for age
    public int getAge(){
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age)
    {
        if (age > 0) {  // Validating that age should be positive
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

class Main
{
    public static void main(String[] args)
	{
        Person person = new Person();
        
        // Using setter methods to set values
        person.setName("John");
        person.setAge(25);

        // Using getter methods to retrieve values
        System.out.println("Name: " + person.getName());  // Output: John
        System.out.println("Age: " + person.getAge());    // Output: 25

        // Trying to set an invalid age
        person.setAge(-5);  							  // Output: Age must be positive
    }
}