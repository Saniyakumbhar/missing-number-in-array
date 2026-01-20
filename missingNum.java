public class missingNum {
    public static void MissingNum(int arr[], int n)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            {
             sum+=arr[i];
             }
        int totalSum= n*(n+1)/2;
        int missingNo=totalSum-sum;
        System.out.println( "MISSING NUMBER IN ARRAY IS => " +missingNo);

    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        int n=arr.length +1;
        MissingNum(arr,n);
    }
    
}
