//Write a java program that will concatenate 2 strings and return the result. The result should
//be in lowercase. Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
//Example1)
//i/p:Sachin,Tendulkar
//o/p:sachin tendulkar
//Example2)
//i/p:Mark,kate
//o/p:markate
import java.util.Scanner;
public class StringConcatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1=input.nextLine().toLowerCase();
        System.out.print("Enter String 2: ");
        String s2=input.nextLine().toLowerCase();
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        if(s1.charAt(s1.length()-1)==s2.charAt(0)){
            sb.delete(s1.length()-1,s1.length());
        }
        System.out.println(sb);
    }
}
