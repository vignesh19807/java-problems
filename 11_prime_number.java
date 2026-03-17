import java.util.Scanner;

public class javaq11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=0)
        {
            isprime=false;
        }
        else
        {
            for (int i=2;i<n;i++)
                {
                if (n%i==0)
                {
                    isprime=false;
                    break;
                }
                }
        }
        if(isprime==true)
        {
            System.out.println(n+": the number is prime");
        }
        else
        {
            System.out.println(n+": the number is not prime");
        }

    }
}
