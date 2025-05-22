public class Main3 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));

        bank.withdraw(1001, 6000.0); // Should show error
        bank.withdraw(1002, 1000.0); // Should succeed

        bank.displayAccounts();
    }
}
