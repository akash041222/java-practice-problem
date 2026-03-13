//Given a string, return a new string made of 'n' copies of the first 2 chars of the original string
//where 'n' is the length of the string.
//Example1)
//i/p:Wipro
//o/p:WiWiWiWiWi
import java.util.*;
public class CopyOfFirstTwoChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s= input.next();
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<=s.length();i++){
            sb.append(s.charAt(0));
            sb.append(s.charAt(1));
        }
        System.out.println(sb);
    }
}
