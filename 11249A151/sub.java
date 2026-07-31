import java.util.Scanner;

public class sub {
   public sub() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int var2 = var1.nextInt();
      System.out.print("Enter second number: ");
      int var3 = var1.nextInt();
      System.out.println("Sub = " + (var2 - var3));
      var1.close();
   }
}
