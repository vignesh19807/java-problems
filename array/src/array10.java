public class array10
{
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,60,70,80,90};
        //System.out.println(arr.length);
        int first=arr[0];
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        for(i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
