package lt.techin.pd9_1;

public class PD9_1 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("LT123456789101112", "Paulius");
        System.out.println(myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(250);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.withdraw(500));
    }
}