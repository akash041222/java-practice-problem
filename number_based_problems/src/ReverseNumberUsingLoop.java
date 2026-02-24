//Program to reverse the number using a loop
import java.util.*;
public class ReverseNumberUsingLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rev=0;
        while(num>0){
            rev*=10;
            rev+=num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
