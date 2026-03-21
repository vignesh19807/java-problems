import java.util.Scanner;

public class javaq8
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number for factoriel:");
        int n = scan.nextInt();
        int fact;
        fact = 1;
        if (n==0)
        {
            System.out.println("the factorial of 0 is 1");
        }
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println("the factorial of  " +n+"is"+fact);
        }

    }
}
