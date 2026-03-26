import java.util.Scanner;

class Resort {
    int RNo, Days;
    String Name;
    float Charges;

    float Compute() {
        float amount = Days * Charges;

        if (amount > 11000)
            amount = 1.02f * amount;

        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room No: ");
        RNo = sc.nextInt();

        System.out.print("Enter Name: ");
        Name = sc.next();

        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Total Amount: " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}