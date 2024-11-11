import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st numer:");
        a=scanner.nextInt();
        System.out.print("Enter the 2nd numer:");
        b=scanner.nextInt();
        System.out.print("Enter the 3rd numer:");
        c=scanner.nextInt();

        if(a>b && a>c){
            System.out.println("The largest number is:"+a);
        }else if(b>c){
            System.out.println("The largest number is:"+b);
        }else{
            System.out.println("The largest number is:"+c);
        }
        scanner.close();
    }
}
