import java.util.Scanner;
public class BankAcc
{
    String accNo,Cusname;
    double bal;
    String Bbranch;
    long mobileNo;

    public BankAcc()
    {
        System.out.println("Properties");
    }
    public BankAcc(String acc,String name,double amount,String branch,long contact)
    {
        accNo=acc;
        Cusname=name;
        bal=amount;
        Bbranch=branch;
        mobileNo=contact;
    }
    public void display()
    {
        System.out.println("Number: "+accNo);
        System.out.println("Name: "+Cusname);
        System.out.println("Balance: "+bal);
        System.out.println("Branch: "+Bbranch);
        System.out.println("Phnnum: "+mobileNo);
    }
    public void deposit(double amt)
    {
        bal=bal+amt;
        System.out.println(amt+" is credited");
    }
    public void withdraw(double amt)
    {
        if(bal-amt<500)
        {
            System.out.println("You should mantain money");
        }
        else 
        {
            bal=bal-amt;
            System.out.println(amt+" is successfull");
        }
    }
    public double balance()
    {
        return bal;
    }
    public static void main(String args[])
    {
        BankAcc c1=new BankAcc("23456734567","vaihu",6789,"kkd",987654321);
         c1.display();
    }
}