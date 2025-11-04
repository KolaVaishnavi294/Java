import java.util.Scanner;
public class Expression
{   
    public static double calculate(int x,int n)
    {    
          double sum=1;
          for(int i=1;i<=n;i++){
            sum+=(Math.pow(-1,i)/Math.pow(x,i));
          }  
          return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        double result=Expression.calculate(x,n);
        System.out.println("The Expression is: "+result);
    }
}