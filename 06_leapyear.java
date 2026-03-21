import java.util.Scanner;

public class javaq4
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("a=");
        int a =scan.nextInt();
        System.out.println("b=");
        int b =scan.nextInt();
        if(a>b)
        {
            System.out.println("a is the biggest number");
        }
        else {
            System.out.println("b is the biggest number");
        }
    }
}
