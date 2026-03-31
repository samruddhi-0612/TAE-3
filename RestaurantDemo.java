class Restaurant {
    boolean foodReady = false;

    synchronized void prepareFood() {
        try {
            while (foodReady)
                wait();

            System.out.println("Chef prepared food");
            foodReady = true;
            notify();

        } catch (Exception e) {}
    }

    synchronized void serveFood() {
        try {
            while (!foodReady)
                wait();

            System.out.println("Waiter served food");
            foodReady = false;
            notify();

        } catch (Exception e) {}
    }
}

class Chef extends Thread {
    Restaurant r;

    Chef(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Chef c = new Chef(r);
        Waiter w = new Waiter(r);

        c.start();
        w.start();
    }
}