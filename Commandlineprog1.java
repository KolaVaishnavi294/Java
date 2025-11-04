public class Commandlineprog1
{
    public static void main(String[] args)
    {
        //System.out.println(args[0]); =>1020
        int x=Integer.parseInt(args[0]);   //"10"=10
        int y=Integer.parseInt(args[1]);  //"20"=20
        System.out.println(x+y);  //30
        System.out.println("Emp ID:"+args[2]);
        System.out.println("Name:"+args[3]);
        System.out.println("Branch:"+args[4]);
    }
}