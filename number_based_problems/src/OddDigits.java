import java.util.*;
public class OddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int digit,result=0,rev=0;
        while(num>0){
            digit=num%10;
            if(digit%2!=0){
                result*=10;
                result+=num%10;
            }
            num/=10;
        }
        while(result>0){
            rev*=10;
            rev+=result%10;
            result/=10;
        }
        System.out.println("Odd sequence: "+rev);
    }
}
