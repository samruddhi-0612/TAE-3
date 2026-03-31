class MusicPlayer extends Thread {

    public void run() {
        System.out.println("Playing song...");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Progress " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        MusicPlayer m = new MusicPlayer();
        m.start();
    }
}