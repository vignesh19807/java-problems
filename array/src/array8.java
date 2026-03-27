public class array8
{
    public static void main(String[] args)
    {
        int arr[]={11,11,22,22,33,66,5,88,5,52,5,45};
        int n = arr.length;

        int j= 0;
        for (int i=0;i<n;i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println("duplicate :" +arr[i]);
                    break;

                }
            }
        }

    }
}
