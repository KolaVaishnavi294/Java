public class BankAccount 
{
    // Private fields
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount() {
        // Stub constructor (can be expanded later)
    }
      //get account number
    public String getAccountNumber() {
        return accountNumber;
    }
    // Setter method for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
     

    // Getter method for balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }

    // Stub method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class to test the BankAccount class
class Main {
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount account = new BankAccount();
        
        // Using setter methods to set the values
        account.setAccountNumber("123456789");
        account.setAccountHolderName("John Doe");
        account.setBalance(1000.50);
		

        // Using getter methods to get the values
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Balance: $" + account.getBalance());

        // Calling the displayAccountInfo method to see all account info
        account.displayAccountInfo(); // Output will show the account's details
    }
}