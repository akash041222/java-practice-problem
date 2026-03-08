//Find the maximum sum of subarray of size k. A subarray is an contiguous/continuous array.
//sliding window approach

public class MaximumSumSubarray {
    public static void main(String[] args){
        int[] arr={2,1,5,1,3,2};
        int k=3;
        int window_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            window_sum+=arr[i];
            if(i>=k-1){
                max_sum=Math.max(window_sum,max_sum);
                window_sum-=arr[i-k+1];
            }
        }
        System.out.println("The Maximum Sum in the subarray is: " +max_sum );
    }
}
