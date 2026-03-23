//this program is about finding the largest number of the array
public class array1
{
    public static void main(String[] args)
    {
        int array[] = {1,2,3,6,5,4};
        int largest=0;
        for(int i=0;i<5;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }
        }
        System.out.println("largest of the array :="+largest);
    }

}
