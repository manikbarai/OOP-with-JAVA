import java.util.Scanner;

public class Thirty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int z = scanner.nextInt();

        if (x < y && y < z) {
            System.out.println("increasing");
        } else if (x > y && y > z) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
        scanner.close();
    }
}
