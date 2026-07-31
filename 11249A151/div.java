import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (b != 0) {
            System.out.println("Quotient = " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        sc.close();
    }
}

