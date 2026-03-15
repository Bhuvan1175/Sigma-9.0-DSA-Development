
class Account {

    public int accNo;
    public String name;
    public String address;
    public String phno;
    public String dob;
    public double balance;

    // Constructor
    public Account(int accNo, String name, String address, String phno, String dob, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.dob = dob;
        this.balance = balance;
    }

    void close() {
        System.out.println("Account " + accNo + " Closed");
    }

    public double getBalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
     
}


// Subclass I

class SavingsAccount extends Account{

    public SavingsAccount(int accNo, String name, String address, String phno, String dob, double balance) {
        super(accNo,name,address,phno,dob,balance);
    }
    

    void Deposite(double amount){
        balance+=amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    void Withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        System.out.println("Withdrawn: " + amount + " | Remaining: " + balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        
    }

    void fixedDeposite(){
        System.out.println("Fixed Deposite created for "+name);
    }

    void liquidate() {
        System.out.println("Account liquidated.");
    }
}

// Subclass II

class LoanAccount extends Account{
    public LoanAccount(int accNo, String name, String address, String phno, String dob, double balance){
        super(accNo,name,address,phno,dob,balance);
    }

    void payEMI(double emi){
        balance-=emi;
         System.out.println("EMI Paid: " + emi + " | Remaining Loan: " + balance);
    }
    void topUpLoan(double amount) {
        balance += amount;
        System.out.println("Loan topped up by: " + amount);
    }

    void repayment() {
        System.out.println("Full repayment done for " + name);
        balance = 0;
    }
}


public class AccountInheritance {

    public static void main(String[] args) {
            SavingsAccount sa=new SavingsAccount(101, "Rahul", "Nagpur", "9876543210", "01-01-2000", 5000);
            sa.Deposite(2000);
            sa.Withdraw(500);
            sa.fixedDeposite();
            sa.close();

            LoanAccount la=new LoanAccount(102, "Bhuvan", "Nagpur", "7083623156", "01-01-2000", 5000);
            la.payEMI(4000);
            la.topUpLoan(500);
            la.repayment();
    }
}


