import java.util.Scanner;
public class FunctionOperations
{   public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        return a/b;
    }
    public static int Bigger(int a,int b)
    {
        if(a>=b)
             return a;
         else
             return b;    
    }
    public static void number(int a)
    {
        if(a==1)
           System.out.println("January");   
        else if(a==2)
           System.out.println("February");   
        else if(a==3)
           System.out.println("March");   
        else if(a==4)
           System.out.println("April");   
        else if(a==5)
           System.out.println("May");   
        else if(a==6)
           System.out.println("June");   
        else if(a==7)
           System.out.println("July");   
        else if(a==8)
           System.out.println("August");   
        else if(a==9)
           System.out.println("September");   
        else if(a==10)
           System.out.println("October");   
        else if(a==11)
           System.out.println("November");  
        else if(a==12)
           System.out.println("December"); 
        else 
           System.out.println("Invalid")   ;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=FunctionOperations.add(a,b);
        int q=FunctionOperations.sub(a,b);
        int r=FunctionOperations.mul(a,b);
        int s=FunctionOperations.div(a,b);
        System.out.println("Add="+p+"\nsub="+q+"\nmul="+r+"\ndiv="+s);
        //if-condition function call
        int larger=FunctionOperations.Bigger(a,b);
        System.out.println("Biggest among "+a+" and "+b+" is: "+larger);
        //if-condition
        if(a>=b) 
            System.out.println("Biggest among "+a+" and "+b+" is: "+a);
        else
            System.out.println("Biggest among "+a+" and "+b+" is: "+b);
            //ternary condition
        int l=a>=b?a:b;
        System.out.println("Biggest is:"+l);
        FunctionOperations.number(a);
    }
}