import java.util.Scanner;

public class FindKey {
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
        System.out.println(num1/1000*((num2/100)%10)+smallest(num3));
    }
}
