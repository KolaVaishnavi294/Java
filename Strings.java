public class Strings
{
    public static void main(String args[])
    {
        String s1="Vaishu";
        String s2=new String("Vaishu");
        String s3="Vaishu";
        String s4=new String("Vaishu");
        System.out.println(s1);
        System.out.println(s2);
        // == Compare the both string have same address or not
        //equals method used to compare the strings have same value or not
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));
    }
}