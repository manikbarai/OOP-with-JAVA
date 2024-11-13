import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Cubes of numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.println("Cube of " + i + " is: " + (i * i * i));
        }

        scanner.close();
    }
}
