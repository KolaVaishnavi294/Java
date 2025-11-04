import java.util.Scanner;
public class Fourmultiples
{
    public static void print(int n,int m,int k,int b,int sum,int pro)
    {
         for(int i=4;i<=n;i+=4){
            System.out.print(i+" ");
         }
         System.out.print("\n");
         for(int i=1;i<=n;i++){
            System.out.println("4 x "+i+"= "+4*i);
         }
         for(int i=1;i<=k;i++){
                System.out.println(m+" x "+i+"= "+m*i);
         }
         while(b!=0){
            int r=b%10;
            sum+=r;
            pro*=r;
            b=b/10;
         }
         System.out.println("Sum="+sum+"\n pro="+pro);
    }
    public static int digits(int a)
    {
        int digit_count=(int)Math.log10(a)+1;
       return digit_count;
    }
    public static void sum(int b)
    {   int s1=0;
        int s2=0;
        while(b!=0)
        {
            int r=b%10;
            if(r%2==0) s1=s1+r;
            else s2=s2+r;
        }
        System.out.println(s1);
        System.out.println(s2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,pro=1;
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        Fourmultiples.print(n,m,k,b,sum,pro);
        System.out.println("Digits_count="+Fourmultiples.digits(a));
        Fourmultiples.sum(b);
        sc.close();
    }
}