/*
Problem: HackWithInfy Easy Sample Problem

Description:
You are given an array A of n integers and q queries.

Query Types:
1. Type 1 Query: (1, l, r)
   Replace A[i] with (i - l + 1) * A[l] for each index i where l <= i <= r.

2. Type 2 Query: (2, l, r)
   Calculate the sum of elements in A from index l to r.

Return the sum of answers of all type 2 queries 

Example:
n = 7
A = [3, 7, 4, 2, 5, 3, 7]
q = 5

Queries:
[1,0,4]
[2,0,1]
[1,3,6]
[2,3,3]
[2,0,5]

Output:
111

Explanation:
After first query → A = [3,6,9,12,15,3,7]
Second query sum → 9
After third query → A = [3,6,9,12,24,36,48]
Fourth query sum → 12
Fifth query sum → 90

Final Answer = 9 + 12 + 90 = 111
*/
import java.util.*;
public class HackWithInfyEasy1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int q= input.nextInt();
        int[] queries=new int[q*3];
        for(int i=0;i<q*3;i++){
            queries[i]= input.nextInt();
        }
        int total_sum=0;
        for(int i=0;i<q*3;i+=3){
            if(queries[i]==1){
                query1(arr,queries[i+1],queries[i+2]);
            }
            else{
                total_sum+=query2(arr,queries[i+1],queries[i+2]);
            }
        }
        System.out.println(total_sum);

    }
    public static void query1(int[] arr1,int l, int r){
        for(int i=0;i< arr1.length;i++){
            if(l<=i && i<=r){
                arr1[i]=(i-l+1)*arr1[l];
            }
        }
    }
    public static int query2(int[] arr2,int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=arr2[i];
        }
        return sum;
    }
}
