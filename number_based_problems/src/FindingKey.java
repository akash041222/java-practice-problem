import java.util.*;
class FindingKey{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input 1:");
        int num1=input.nextInt();
        System.out.print("Enter input 2:");
        int num2=input.nextInt();
        System.out.print("Enter input 3:");
        int num3=input.nextInt();
        int mul=1;
        int result=0;
        while(num1>0&&num2>0&&num3>0){
            int rem1=num1%10;
            int rem2=num2%10;
            int rem3=num3%10;
            int high=Math.max(rem1,Math.max(rem2,rem3));
            int low=Math.min(rem1,Math.min(rem2,rem3));
            int sub=high-low;
            result+=sub*mul;
            mul*=10;
            num1/=10;
            num2/=10;
            num3/=10;
        }
        System.out.print(result);
    }
}
