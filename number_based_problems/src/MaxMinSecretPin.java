import java.util.Scanner;
public class MaxMinSecretPin {
        public static int MaxMin(int a){
            int max=0,min=10;
            while(a>0){
                int rem=a%10;
                max=Math.max(max,rem);
                min=Math.min(min,rem);
                a/=10;
            }
            return max*min;
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
            int result = MaxMin(num1)+MaxMin(num2)+MaxMin(num3)-num4;

            System.out.print(result);
        }

}

