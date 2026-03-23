import java.util.Scanner;

public class javaq22
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the fiirst number:");
        int a  = scan.nextInt();
        System.out.println("enter the second number:");
        int b = scan.nextInt();
        int min;
        int hcf=1;
        if(a<b)
        {
            min=a;
        }
        else
        {
            min=b;
        }
        for (int i=1;i<=min;i++)
        {
            if (a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("hcf="+hcf);
    }
}
