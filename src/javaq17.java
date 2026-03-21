import java.util.Scanner;

public class javaq17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        // Find sum of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        // Check Harshad condition
        if (n % sum == 0) {
            System.out.println(n + " is a Harshad Number");
        } else {
            System.out.println(n + " is NOT a Harshad Number");
        }
    }
}