import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is Not a Prime Number.");
        } else if (num == 2) {
            System.out.println(num + " is a Prime Number.");
        } else if (num % 2 == 0) {
            System.out.println(num + " is Not a Prime Number.");
        } else {
            System.out.println(num + " is a Prime Number.");
        }

        sc.close();
    }
}

