import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len=input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Enter the target number: ");
        int target=input.nextInt();
        Solution ans=new Solution();
        for(int k:ans.twoSum(arr,target)){
            System.out.println(k);
        }
    }
}
