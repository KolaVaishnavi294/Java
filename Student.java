public class Student 
{
    String rollNum,sname,branch;
    float cgpa;
    boolean isPlaced;
    String companyName;
    float pack;
    public Student()
    {
        System.out.println("Vaishu");
    }
    
    public Student(String rno,String name,String dept,float cgpa,String Company,float pack)
    {
        rollNum=rno;
        sname=name;
        branch=dept;
        this.cgpa=cgpa;
        isPlaced=true;
        companyName=Company;
        this.pack=pack;
    }
    public Student(String rollNum,String sname,String branch,float cgpa)
    {
        this.rollNum=rollNum;
        this.sname=sname;
        this.branch=branch;
        this.cgpa=cgpa;
    }
    public void getDetails()
    {
        System.out.println("Roll Num: "+rollNum);
        System.out.println("Name: "+sname);
        System.out.println("Branch: "+branch);
        System.out.println("CGPA: "+cgpa);
    }
    public void getPlacementInfo()
    {
        if(isPlaced)
         {
            System.out.println("Company Name: "+companyName);
            System.out.println("Package: "+pack);
         }
         else
         System.out.println("Not yet selected. Wish you all the best!");
    }
    public static void main(String[] args) 
	{
        Student s1=new Student("21A91A01234","Rajesh","CSE",9.5f,"Wipro",6);
        Student s2=new Student("22A91A05C5","Bhanu","IT",6.9f);
        Student s3=new Student();
        s1.getDetails();
        s1.getPlacementInfo();
        System.out.println("----------------------------------");
        s2.getDetails();
        s2.getPlacementInfo();
    }
}
