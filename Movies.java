import java.util.Scanner;
public class Movies {
  public static int Calculating(int hits, int avgs, int flops)
  {
    return (hits*10+avgs*5+flops*-5);
  }
    public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int hit, avg, flop;
    String name1=sc.next();
    hit=sc.nextInt();
    avg=sc.nextInt();
    flop=sc.nextInt();
    int hero1=Calculating(hit, avg, flop);
    System.out.println(name1 + " total movies: "+hero1);

    int hit2, avg2, flop2;
    String name2=sc.next();
    hit2=sc.nextInt();
    avg2=sc.nextInt();
    flop2=sc.nextInt();
    int hero2=Calculating(hit2, avg2, flop2);
    System.out.println(name2 + " total movies: "+hero2);

    if(hero1>hero2)
    {
      System.out.println("Best hero: "+name1);
    }
    else{
      System.out.println("Best hero: "+name2);
    }
  }
}