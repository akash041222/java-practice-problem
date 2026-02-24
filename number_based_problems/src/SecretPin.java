import java.util.*;
public class SecretPin {
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
        int even_sum=0,odd_sum=0;
        while(num1>0 && num2>0 && num3>0){
            int rem1=num1%10;
            int rem2=num2%10;
            int rem3=num3%10;
            if(rem1%2==0){
                even_sum+=rem1;
            }
            else{
                odd_sum+=rem1;
            }
            if(rem2%2==0){
                even_sum+=rem2;
            }
            else{
                odd_sum+=rem2;
            }
            if(rem3%2==0){
                even_sum+=rem3;
            }
            else{
                odd_sum+=rem3;
            }
            num1/=10;
            num2/=10;
            num3/=10;
        }
        if(num4%2==0){
            System.out.println("PIN: "+even_sum);
        }
        else{
            System.out.println("PIN: "+odd_sum);
        }
    }
}
