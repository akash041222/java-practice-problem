public class EvenNumberInReverse {
    public static void main(String[] args){
        int[] arr={5,10,15,20,25,30,45};
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
