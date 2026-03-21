import java.util.Scanner;

public class java13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest number: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number: " + b);
        } else {
            System.out.println("Largest number: " + c);
        }
    }
}