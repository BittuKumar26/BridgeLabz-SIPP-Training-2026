class BankAccount {
    String accountNumber, holder;
    double balance;
    static int totalAccounts = 0;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Overdraft not allowed");
    }

    void getStatement() {
        System.out.println(accountNumber + " " + holder + " Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("101","Bittu",10000);
        BankAccount a2 = new BankAccount("102","Ayush",15000);
        BankAccount a3 = new BankAccount("103","Ravi",20000);

        a1.deposit(1000); a1.withdraw(500); a1.deposit(2000); a1.withdraw(1000); a1.deposit(500);
        a2.deposit(500); a2.withdraw(300); a2.deposit(1000); a2.withdraw(200); a2.deposit(400);
        a3.deposit(2000); a3.withdraw(1000); a3.deposit(500); a3.withdraw(300); a3.deposit(700);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();
        System.out.println("Total Accounts: " + totalAccounts);
    }
}