import java.util.Scanner;
public class Triangleornot {
    public static boolean side(int x,int y,int z){
        if((x+y>z)||(y+z>x)||(z+x>y))
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        boolean status = Triangleornot.side(a,b,c);
        if(status)
        System.out.println("Forms a triangle");
        else
        System.out.println("Triangle won't form");
    }
}