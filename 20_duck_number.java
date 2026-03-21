import java.util.Scanner;

public class javaaq18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();  // take input as String

        if (num.charAt(0) != '0' && num.contains("0")) {
            System.out.println(num + " is a Duck Number");
        } else {
            System.out.println(num + " is NOT a Duck Number");
        }
    }
}
