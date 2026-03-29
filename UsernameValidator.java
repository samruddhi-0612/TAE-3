import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // remove spaces
        username = username.trim();

        // convert to lowercase
        username = username.toLowerCase();

        System.out.println("Cleaned Username: " + username);
    }
}