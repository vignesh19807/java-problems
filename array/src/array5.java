public class array5
{
    public static void main(String[] args)
    {
        int array []={1,2,3,4,5,6,7,8,9};
        int oddcount = 0;
        int evencount = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                oddcount++;
            }
            else{
                evencount++;
            }
        }

        System.out.println("Odd count: "+oddcount);
        System.out.println("Even count: "+evencount);
    }
}
