import java.util.Scanner;
public class Switchcase
{    
    public static int calculator()
    {
        Scanner sc=new Scanner(System.in);
        int opt,a=0,b=0,res=0;
        System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV");
        System.out.println("Enter the choice");
        opt=sc.nextInt();
        if(opt>=1&&opt<=4){
            System.out.println("Enter two values");
            a=sc.nextInt();
            b=sc.nextInt();
        }
        switch(opt)
        {
            case 1:
                 res=a+b;
                  break;
            case 2:
                  res=a-b;
                   break;
            case 3:
                 res=a*b;
                  break;
            case 4:
                 res=a/b;
                  break;
            default:
               System.out.println("Invalid");
               break;
        }
        return res;
    }
    public static void main(String args[])
    {
          int result=Switchcase.calculator();
          System.out.println(result);
    }
}