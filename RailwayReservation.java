class Reservation {
    int seats = 1;

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class Passenger extends Thread {
    Reservation r;
    String name;

    Passenger(Reservation r, String name) {
        this.r = r;
        this.name = name;
    }

    public void run() {
        r.bookTicket(name);
    }
}

public class RailwayReservation {
    public static void main(String[] args) {

        Reservation r = new Reservation();

        Passenger p1 = new Passenger(r, "Amit");
        Passenger p2 = new Passenger(r, "Rahul");

        p1.start();
        p2.start();
    }
}