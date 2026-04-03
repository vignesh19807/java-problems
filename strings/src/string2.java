public class string2
//check whether is the string palindrome
{
    public static void main(String[] args) {
        String str1 = "hello whoo";
        String rev = "";
        for(int i= str1.length()-1;i>=0;i--)
        {
            rev = rev+str1.charAt(i);
        }
        if(str1.equals(rev))
        {
            System.out.println("the given string is palindrome");
        }
        else {
            System.out.println("the given string is not palindrome");
        }
    }

}
