public class ExceptionDemo2
{
    public static void main(String args[])
    {
        int x[]={10,20,30,40};
        try
        {
            for(int i=0;i<=x.length;i++)
            {
               System.out.println(x[i]+" ");
            }
        }
        catch(Exception obj)
        {
            System.out.println("i values crosses the array index range");
        }
        System.out.println("Task completed");
    }
}