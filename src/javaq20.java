import java.util.Scanner;

public class javaq20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sq = n * n;
        int temp = n;
        int digits = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int divisor = (int)Math.pow(10, digits);

        int right = sq % divisor;
        int left = sq / divisor;

        if (left + right == n) {
            System.out.println(n + " is a Kaprekar Number");
        } else {
            System.out.println(n + " is NOT a Kaprekar Number");
        }
    }
}