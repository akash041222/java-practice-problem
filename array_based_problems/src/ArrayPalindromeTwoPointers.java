//Program to check if an array is palindrome using two pointers
import java.util.*;
public class ArrayPalindromeTwoPointers {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int left=0;
        int right= arr.length-1;
        boolean flag=true;
        while(left<right){
            if(arr[left]!=arr[right]){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
