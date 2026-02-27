public class ExceptionDemo8
{
    public static int division(int a, int b)throws ArithmeticException
    {
        if(b==0)
            throw new ArithmeticException("Don't divide with zero");
        return a/b;
    }
    public static void main(String[] args)
    {
        try
        {
            int result=division(15, 0);
            System.out.println(result);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
    }
}