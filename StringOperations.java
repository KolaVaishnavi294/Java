public class StringOperations
{
    public static void main(String args[])
    {
        String s1="Life is Beautiful";
        System.out.println("Given string s1= "+s1);
        System.out.println("Length= "+s1.length());
        //character at indexes
        System.out.println("Character at 1 index= "+s1.charAt(1));
        //index 
        System.out.println("Index of character i = "+s1.indexOf('i'));
        System.out.println("Index of string 'is' at: "+s1.indexOf("is"));
        System.out.println("Index of character i from last = "+s1.lastIndexOf('i'));
        System.out.println("Check for 'is' available in the string: "+s1.contains("is"));
        System.out.println("Lower case string: "+s1.toLowerCase());
        System.out.println("Upper case string: "+s1.toUpperCase());
        System.out.println("After applying trim: "+s1.trim());
        System.out.println("Substring from index 4: "+s1.substring(4));
        System.out.println("Substring from 4 to 7: "+s1.substring(4,7));
        System.out.println("replace 'is' with 'was': "+s1.replace("is","was"));
        String words[]=s1.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        for(int i=1;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
        String s2="ram";
        String s3="hanuman";
        String s4="sita";
        System.out.println(s2.compareTo(s4));
        System.out.println(s2.compareTo(s3));
    } 
}