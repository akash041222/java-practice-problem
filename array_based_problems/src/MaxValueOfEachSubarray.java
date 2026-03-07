import java.util.*;
public class MaxValueOfEachSubarray {
    public static void main(String[] args){
        int arr[]={10,5,2,7,8,7};
        int k=3;
        int window_sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(i>=k-1){
                System.out.println(max);

            }
        }

    }
}
