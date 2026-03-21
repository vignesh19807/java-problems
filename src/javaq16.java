import java.util.Scanner;

public class javaq16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int square = n * n;

        int temp = n;
        int digits = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int mod = (int) Math.pow(10, digits);

        if (square % mod == n) {
            System.out.println(n + " is an Automorphic Number");
        } else {
            System.out.println(n + " is NOT an Automorphic Number");
        }
    }
}
