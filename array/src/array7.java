public class array7
{
    public static void main(String[] args)
    {
        int arr[]={65,845,5,8,7,85,5,8};
        System.out.print("Original Array :");
        for(int i=0;i<arr.length;i++)

            System.out.print(arr[i] +" ");

        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("\nsorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }


    }
}
