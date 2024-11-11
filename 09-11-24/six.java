import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double b = scanner.nextDouble();

               if (Math.abs(a - b) < 0.001) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }
}
