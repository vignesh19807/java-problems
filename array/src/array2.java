//this is the program to find the smallest element of the array
public class array2
{
    public static void main(String[] args) {
        int array[]={8,8,9,84,4,8,1};
        int i;
        int min=array[0];
        for(i=0;i<=6;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("minimum element of the array ="+min);

    }
}
