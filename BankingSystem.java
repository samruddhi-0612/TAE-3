class Account {
    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println("Withdrawing " + amount);
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

class Customer extends Thread {
    Account acc;

    Customer(Account acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(700);
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        Account acc = new Account();

        Customer c1 = new Customer(acc);
        Customer c2 = new Customer(acc);

        c1.start();
        c2.start();
    }
}