public class Bank {
    private BankAccount[] accounts = new BankAccount[5];
    private int count = 0;

    public void addAccount(BankAccount account) {
        if (count < accounts.length) {
            accounts[count++] = account;
        } else {
            System.out.println("Bank is full.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                try {
                    accounts[i].withdraw(amount);
                    System.out.println("Withdrawn " + amount + " from account " + accountNumber);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }
}
