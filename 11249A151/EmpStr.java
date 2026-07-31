import java.util.Scanner;

public class EmpStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee 1 Name: ");
        String emp1 = sc.nextLine();

        System.out.print("Enter Employee 2 Name: ");
        String emp2 = sc.nextLine();

        if (emp1.equalsIgnoreCase(emp2)) {
            System.out.println("Employees are working in the same department.");
        } else {
            System.out.println("Employees are working in different departments.");
        }

        sc.close();
    }
}