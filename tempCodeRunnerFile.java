class Father 
{ 
    String fname;
    int age;
    public Father(String fname,int age )
    {
        this.fname=fname;
        this.age=age;
    }
    public void displayinfo()
    {
          System.out.println("Father name: "+fname);
          System.out.println("Age: "+age);
    }
}
class child extends Father
{
    string cname;
    int age;
    public child(String fname,int fage,string cname,int cage)
    {
        super(fname,cname);
        this.cname=cname;
        this.age=cage;
    }
    @Override
    public void displayinfo()
    {
        super.displayinfo();
        System.out.println("child name: "+cname);
        System.out.println("age: "+age);

    }
}
public class superdemo
{
    public static void main(String args[])
    {
          child obj=new child();
        obj.displayinfo();
    }
}