import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];

        System.out.println("Enter 10 Book Titles:");

        for (int i = 0; i < books.length; i++) {
            books[i] = sc.nextLine();
        }

        System.out.println("\nBooks starting with letter 'A':\n");

        for (String book : books) {
            if (book.startsWith("A") || book.startsWith("a")) {
                System.out.println(book);
            }
        }

        sc.close();
    }
}
