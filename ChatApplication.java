class Sender extends Thread {
    public void run() {
        System.out.println("Sending message...");
    }
}

class Receiver extends Thread {
    public void run() {
        System.out.println("Receiving message...");
    }
}

public class ChatApplication {
    public static void main(String[] args) {

        Sender s = new Sender();
        Receiver r = new Receiver();

        s.start();
        r.start();
    }
}