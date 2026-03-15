import java.util.Scanner;

public class javaq3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to find odd or even:");
        int n = scan.nextInt();
        if(n%2==0)
        {
            System.out.println("the number is even");
        }
        else
        {
            System.out.println("the numbeer is odd");
        }
    }
}
