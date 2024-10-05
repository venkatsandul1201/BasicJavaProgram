public class BankAccount {
    String AcNo;
    double balance;
    public static void main(String[] args) {
        BankAccount ac=new BankAccount();
        ac.AcNo="123456789";
        ac.balance=1000.50;
        System.out.println("account no is"+ac.AcNo);
        System.out.println("balance"+ac.balance);
    }
    
}
