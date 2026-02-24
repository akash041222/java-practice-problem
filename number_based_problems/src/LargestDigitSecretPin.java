import java.util.Scanner;
public class LargestDigitSecretPin {
    public static int largest(int a){
        int max=0;
        while(a>0){
            int rem=a%10;
            max=Math.max(max,rem);
            a/=10;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input 1:");
        int num1=input.nextInt();
        System.out.print("Enter input 2:");
        int num2=input.nextInt();
        System.out.print("Enter input 3:");
        int num3=input.nextInt();
        System.out.print("Enter input 4:");
        int num4=input.nextInt();
        int result = largest(num1)*largest(num2)*largest(num3)+num4;
        System.out.print(result);
    }
}
