//Program to add all the digits in a given number
//Input: 56789
//Output: 35
import java.util.*;
public class AddDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of Digits is: "+sum);
    }
}
