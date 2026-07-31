import java.util.Scanner;

public class Feedbackavg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rating = new int[5];
        int sum = 0;

        System.out.println("Enter 5 Feedback Ratings:");

        for (int i = 0; i < rating.length; i++) {
            rating[i] = sc.nextInt();
            sum += rating[i];
        }

        double average = (double) sum / rating.length;

        System.out.println("Average Rating = " + average);

        sc.close();
    }
}