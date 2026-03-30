import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            int balance = sc.nextInt();

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}