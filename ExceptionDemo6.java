// try-catch-finnaly
public class ExceptionDemo6
{
    public static void main(String[] args)
    {
        try
        {
            int z=10/5;
            System.out.println(z);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Second parameter should be non zero");
        }
        finally
        {
            System.out.println("mandatory to execute");
        }
        System.out.println("Task is completed");
    }
}