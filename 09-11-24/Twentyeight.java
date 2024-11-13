import java.util.Scanner;

public class Twentyeight {
    public static void main(String[] args){
     Scanner scanner =new Scanner(System.in);
     System.out.println("Enter a number:");
     double number = scanner.nextDouble();
     if(number==0){
        System.out.println("Zero");
     }else{
        if (number > 0) {
             System.out.print("Positive");
     }else {
         System.out.print("Negative"); 
        }
        if (Math.abs(number) < 1) { 
            System.out.println(" small");
         } else if (Math.abs(number) > 10000000) { 
            System.out.println(" large"); 
        } else { 
            System.out.println(); 
        } 
    }
     scanner.close();
    } 
}
