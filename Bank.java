class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException()
    {
        super();
    }
    public InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}
class Bank
{
    String acno, custName;
    double balance;
    public Bank(String acno, String custName, double balance)
    {
        this.acno=acno;
        this.custName=custName;
        this.balance=balance;
    }
    public void displayCustInfo()
    {
        System.out.println("Acno => "+acno);
        System.out.println("Cust Name => "+custName);
        System.out.println("Balance => "+balance);
    }
    public void withdraw(double amt)throws InsufficientBalanceException
    {
        if(balance-amt<500)
            throw new InsufficientBalanceException("Minimum of 500 need to maintain in an account");
        balance=balance-amt;
    }
    public static void main(String[] args)throws InsufficientBalanceException
    {
        Bank cust1=new Bank("28749302934","Ramya",5000);
        cust1.displayCustInfo();
        try
        {
            cust1.withdraw(5000);
        }
        catch(InsufficientBalanceException ie)
        {
            System.out.println(ie);
        }
        finally
        {
            System.out.println("Finally executed");
        }
        cust1.displayCustInfo();
    }
}