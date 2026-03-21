import java.util.Scanner;

public class javaq10
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the numbers to sum:");
        int n=scan.nextInt();
        int sum=0;

        while (n!=0)
        {
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("The sum is:"+sum);

    }
}
