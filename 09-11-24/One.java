import java.util.Scanner;

public class One{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int x=scanner.nextInt();
            if (x>0){
                System.out.println("Positive Number");
            } else if (x<0){
                System.out.println("Negative Number");
            }else{
                System.out.println("Zero");
            }
        }catch(Exception e){
            System.out.println("ïnvalid Number");
        }
        scanner.close();
    }
}