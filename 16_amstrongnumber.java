import java.util.Scanner;

public class javaq15
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number to check wheher is ampstrong or not:");
        int num=scan.nextInt();
        int original = num;
        int  sum=0;
        while(num!=0)
        {
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(original==sum)
        {
            System.out.println("the number is equal to original  "+original);
        }
        else {
            System.out.println("the number is not equal to original "+original);
        }



    }
}
