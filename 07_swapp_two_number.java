import java.util.Scanner;

public class javaq7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number for a = ");
        int a = scan.nextInt();
        System.out.println("enter a number for b = ");
        int b = scan.nextInt();
        System.out.println("before swapping a ="+a);
        System.out.println("before swapping b ="+b);
        a=a+b;
        b=a-b;
        a=a-b;;
        System.out.println("after swapping a="+a);
        System.out.println("after swapping b="+b);
    }
}
