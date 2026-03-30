class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            System.out.println("Reading file...");
            // simulate error (optional)
            int x = 10 / 2;

        } catch (Exception e) {
            System.out.println("Error occurred");

        } finally {
            System.out.println("Closing file resources");
        }
    }
}