//Write a java program that accepts a string and returns a new string without the first and last
//character of the input string.
//Example1)
//i/p:Suman
//o/p:uma
import java.util.*;
public class RemoveFirstLastChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        System.out.println(s.substring(1,s.length()-1));
    }
}
