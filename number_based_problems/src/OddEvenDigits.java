import java.util.*;
public class OddEvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int digit, oddResult = 0, evenResult = 0, oddRev = 0, evenRev = 0;
        while (num > 0) {
            digit = num % 10;
            if (digit%2!=0) {
                oddResult=oddResult*10 +digit;
            } else {
                evenResult =evenResult*10 + digit;
            }
            num /= 10;
        }
        while (oddResult > 0) {
            oddRev=oddRev*10 +(oddResult % 10);
            oddResult/=10;
        }
        while (evenResult > 0) {
            evenRev= evenRev*10 + (evenResult % 10);
            evenResult/=10;
        }
        System.out.println(oddRev + "" + evenRev);
    }
}

