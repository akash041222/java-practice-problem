//Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string
//on the outside and the longer string on the inside.
//The strings will not be the same length, but they may be empty (length 0).
import java.util.*;
public class ShortLongShortString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1=input.nextLine();
        System.out.print("Enter String 2: ");
        String s2=input.nextLine();
        StringBuffer sb=new StringBuffer();
        if(s2.length()>s1.length()){
            sb.append(s1);
            sb.append(s2);
            sb.append(s1);
        }
        else{
            sb.append(s2);
            sb.append(s1);
            sb.append(s2);
        }
        System.out.println(sb);
    }
}
