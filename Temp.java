import java.util.Scanner;
public class Temp {
    public static void code(int t){
        if(t<0)
        System.out.println("Freezing weather");
        else if(0<=t&&t<10)
        System.out.println("Very cold weather");
        else if(10<=t&&t<20)
        System.out.println("Cold weather");
        else if(20<=t&&t<30)
        System.out.println("Normal weather");
        else if(30<=t&&t<40)
        System.out.println("Hot weather");
        else if(t>=40)
        System.out.println("Very hot weather");
        else
        System.out.println("I can't measure the temperature");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        Temp.code(temp);
    }
}