//Write a Program to check whether a given String is Palindrome or not.
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s= input.nextLine();
        StringBuffer sb=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        if(s.equals(sb.toString())){
            System.out.println(s+" is a Palindrome");
        }
        else{
            System.out.println(s+" is not a Palindrome");
        }
    }
}
