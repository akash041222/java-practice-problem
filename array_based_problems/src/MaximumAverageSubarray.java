//Find the maximum average of subarray of size k. A subarray is an contiguous/continuous array.
//sliding window approach
import java.util.*;
public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        int window_sum=0;
        double max_avg=Double.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            window_sum+=arr[i];
            if(i>=k-1){
                max_avg=Math.max(max_avg,(double)window_sum/k);
                window_sum-=arr[i-k+1];
            }
        }
        System.out.println(max_avg);
    }
}
