public class SumOfPrime {
    public static void main(String[] args) {
        int[] arr={10,41,18,50,43,31,29,25,59,96,67};
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=2;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==1){
                sum+=arr[i];
                min=Math.min(min,arr[i]);
            }
        }
        sum-=min;
        System.out.println("Sum of Prime number is the array except the smallest prime number is "+sum);
    }
}
