public class string1
//reversing a string
{
    public static void main(String[] args)
    {
        String str = "hello";
        String rev = "";
        for(int i=str.length()-1;i>0;i--)
        {
            rev = rev+ str.charAt(i);
        }
        System.out.println("reversed string is :"+rev);

    }
}
