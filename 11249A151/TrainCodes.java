
    public class TrainCodes {
    public static void main(String[] args) {

        String[] trainCodes = {"T101", "T102", "T103"};

        try {
            System.out.println(trainCodes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program Continues...");
    }
}
