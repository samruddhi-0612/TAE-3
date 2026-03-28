class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Bank b = new Bank();

        System.out.println("Interest on 1000: " + b.calculateInterest(1000));
        System.out.println("Interest on 5000: " + b.calculateInterest(5000));
    }
}