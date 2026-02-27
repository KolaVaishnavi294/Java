class Father
{
    String name;
    int age;
    public Father(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
class child extends Father
{   
    String cname;
    int cage;
    public child(String fname,int fage,String cname,int cage)
    {    
        super(fname,fage);
        this.cname=cname;
        this.cage=cage;
    }
    @Override
    public void display()
    {   super.display();
        System.out.println(cname);
        System.out.println(cage);
    }
}
public class SingleInheri
{
 public static void main(String args[])
 {
 child c1=new child("Chiranjeevi",63,"Ram Charan",39);
 c1.display();
 }
}
