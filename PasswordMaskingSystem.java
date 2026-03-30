import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        int len = pass.length();

        if (len > 2) {
            String masked = pass.substring(0, len - 2).replaceAll(".", "*")
                           + pass.substring(len - 2);
            System.out.println("Masked Password: " + masked);
        } else {
            System.out.println("Password too short");
        }
    }
}