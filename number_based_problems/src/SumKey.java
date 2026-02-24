import java.util.Scanner;
public class SumKey {
    public static int largest(int a){
        int max=0;
        while(a>0){
            int rem=a%10;
            max=Math.max(max,rem);
            a/=10;
        }
        return max;
    }
    public static int smallest(int a){
        int min=10;
        while(a>0){
            int rem=a%10;
            min=Math.min(min,rem);
            a/=10;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input 1:");
        int num1=input.nextInt();
        System.out.print("Enter input 2:");
        int num2=input.nextInt();
        System.out.print("Enter input 3:");
        int num3=input.nextInt();
        int largest_sum = largest(num1)+largest(num2)+largest(num3);
        int smallest_sum = smallest(num1)+smallest(num2)+smallest(num3);
        int result = largest_sum - smallest_sum;

        System.out.print(result);
    }
}
