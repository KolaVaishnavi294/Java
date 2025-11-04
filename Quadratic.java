import java.util.Scanner;
class Quadratic
{
    public static void main (String args[])
   { 
       float a,b,c,x,root1,root2;
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the coefficients a , b , and c ");
       a=sc.nextFloat();
       b=sc.nextFloat();
       c=sc.nextFloat();
       x=b*b-4*a*c;
      if(x>0)
      {
         root1=(float)(-b+Math.sqrt(x)/(2 * a));
         root2=(float)(-b-Math.sqrt(x)/(2 * a));
         System.out.println("Roots are real and unequal");
         System.out.println("The equation has two real roots: "+root1+root2);
      }
      else if(x== 0)
      {
         Float root = -b/(2*a);
         System.out.println("Roots are equal");
         System.out.println("The equation has two real roots: "+ root);
      }
      else
      {
         float realpart=-b/(2*a);
         float imaginarypart=(float)Math.sqrt(-x)/(2*a);
         System.out.println("Roots are imaginary");
         System.out.println("The equation has two complex roots: "+realpart+"+"+imaginarypart+"i and "+realpart+"-"+imaginarypart+"i");
      }
    }
}