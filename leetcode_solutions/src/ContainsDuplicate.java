//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation: The element 1 occurs at the indices 0 and 3.

//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//Explanation: All elements are distinct.

import java.util.*;
class Solution3{
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len=input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=input.nextInt();
        }
        Solution3 ans=new Solution3();
        System.out.println(ans.containsDuplicate(arr));
    }
}
