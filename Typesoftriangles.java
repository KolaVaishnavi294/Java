import java.util.Scanner;
public class Typesoftriangles {
    public static void side(int x,int y,int z)
    {
        if((x==y)&&(y==z))
        System.out.println("Equilateral triangle");
        else if((x==y)&&(x!=z))
        System.out.println("Isoceles triangle");
        else if((x!=y)&&(y!=z)&&(z!=x))
        System.out.println("Scalene triangle");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int triangle=Typesoftriangles.side(a,b,c);
    }
}