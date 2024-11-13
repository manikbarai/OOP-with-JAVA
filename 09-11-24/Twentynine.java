import java.util.Scanner;

public class Twentynine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than ten billion: ");
        long number = scanner.nextLong();

        if (number < 0 || number >= 10000000000L) {
            System.out.println("Error: The number must be a positive integer less than ten billion.");
        } else {
            int digitCount = String.valueOf(number).length();
            System.out.println("The number " + number + " has " + digitCount + " digits.");
        }
        scanner.close();
    }
}
