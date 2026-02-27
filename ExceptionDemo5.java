//try with multicatch;
public class ExceptionDemo5
{
    public static void main(String[] args)
    {
        int x,y,z;
        try
        {
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            z=x/y;
            System.out.println("Division= "+z);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Second parameter should be non zero");
        }
        catch(NumberFormatException noe)
        {
            System.out.println("Inputs should be numbers only");
        }
        catch(ArrayIndexOutOfBoundsException aoe)
        {
            System.out.println("Program requires minimum of two integer numbers");
        }
        catch(Exception e)
        {
            System.out.println("Default Exception");
        }
        System.out.println("Task Completed");
    }
}