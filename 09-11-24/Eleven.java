import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        scanner.close();
    }
}
