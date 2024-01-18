
package lt.techin;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountOwner;
    //kuriame konstruktoriu.
    public BankAccount(String accountNumber, String accountOwner) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = 0.0; //is pradziu banko saskaita visada yra tuscia, todel inicializuojame atskirai ir balansas 0.
    }
    //pinigu inesimas
    public void deposit (double amount) {
        if (amount > 0){ //negalime inesti neigiamos sumos ir nulio
            this.balance += amount;
        } else {
            throw new IllegalArgumentException(); //isimtis
        }
    }
    //pinigu isemimas
    public boolean withdraw (double amount) {
        if (amount > 0 && balance >= amount){ //tikriname ar suma didesne uz balansa arba lygi sumai,kuria isiminesime
            balance -= amount; //is balanso atimame isimama suma
            return true;// operacija pavyko
        }
        return false;
    }
    //inicializuojame getterius
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountOwner() {
        return accountOwner;
    }
    //inicializuojame setterius
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;//ar saskaitos numeris egzistuoja ir jis nera tuscias
        if (accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException ("Invalid account number!");
        }
    }
    public void setAccountOwner (String accountOwner){
        this.accountOwner = accountOwner;//ar saskaitos savininkas egzistuoja ir jo vardas netuscias
        if (accountOwner != null && accountOwner.trim().isEmpty()) {
            this.accountOwner = accountOwner;
        } else {
            throw new IllegalArgumentException("Illegal account number name!");
        }
    }
    //perrasome to String metoda = objektas prisistato
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountOwner='" + accountOwner + '\'' +
                '}';
    }
}