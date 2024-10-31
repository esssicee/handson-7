package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount Gospel = new BankAccount(100);

        //Beli minuman 10 (withdraw)
        Gospel.withdraw(10);
        System.out.println("Current balance is: " +Gospel.getBalance());
    }
}