import java.util.Scanner;
class TooYoungException extends RuntimeException
{
    public TooYoungException()
    {
        super();
    }
    public TooYoungException(String msg)
    {
        super(msg);
    }
}
class TooOldException extends RuntimeException
{
    public TooOldException()
    {
        super();
    }
    public TooOldException(String msg)
    {
        super(msg);
    }
}
class ExceptionMarriage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        try
        {
            age=sc.nextInt();
            if(age<18)
               throw new TooYoungException("You are not eligible for marriage");
            else if(age>=45)
               throw new TooOldException("Sorry! Your age is too old to get marry");
            else
               System.out.println("You are eligible to get marryy");

        }
        catch(NumberFormatException ime)
        {
            System.out.println("Input should be integer only");
        }
        catch(TooOldException old)
        {
            System.out.println(old);
        }
        catch(TooYoungException young)
        {
            System.out.println(young);
        }
        catch(Exception e)
        {
            System.out.println("Default handling");
        }
        finally
        {
            System.out.println("Executed final block");
        }
        System.out.println("Task is completed");
    }
}