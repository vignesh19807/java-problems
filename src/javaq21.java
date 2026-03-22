import java.util.Scanner;

public class javaq21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = num;

        // Repeat until single digit
        while (sum > 9) {
            int temp = sum;
            sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
        }

        if (sum == 1) {
            System.out.println(num + " is a Magic Number");
        } else {
            System.out.println(num + " is NOT a Magic Number");
        }

        sc.close();
    }
}