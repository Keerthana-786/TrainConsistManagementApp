public class TrainConsistManagementApp {
    public static void main(String[] args) {
        try {
            int capacity = -1;

            if (capacity <= 0) {
                throw new IllegalArgumentException("Invalid Capacity");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
