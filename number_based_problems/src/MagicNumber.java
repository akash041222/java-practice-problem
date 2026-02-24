//A number is said to be a magic number, if the sum of its digits are calculated till
// a single digit recursively by adding the sum of the digits after every addition.
// If the single digit comes out to be 1,then the number is a magic number.
import java.util.*;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
            if(num==0 && sum>9){
                num=sum;
                sum=0;
            }
        }
        if(sum==1){
            System.out.println("It is a magic number");
        }
        else{
            System.out.println("Not a magic number");
        }
    }
}
