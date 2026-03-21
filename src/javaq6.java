import java.util.Scanner;

public class javaq6
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a year to find leap or not:");
        int year = scan.nextInt();
        if(( year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println("the entered year was leap");
        }
        else
        {
            System.out.println("the year was not leap");
        }
    }
}
