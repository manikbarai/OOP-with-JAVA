import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of odd natural numbers to sum: ");
        int n = scanner.nextInt();

        int sum = 0;
        int oddNumber = 1;

        for (int i = 0; i < n; i++) {
            sum += oddNumber;
            oddNumber += 2;
        }

        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);

        scanner.close();
    }
}
