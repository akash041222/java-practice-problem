//Write a java program that will return the first half of the string, if the length of the string is
//even. It should return null for odd length string.
//Example1)
//i/p:TomCat
//o/p:Tom
//Example2)
//i/p:Apron
//o/p:null
import java.util.*;
public class ReturnFirstHalf {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner input = new Scanner(System.in);
        String s=input.next();
        if(s.length()%2!=0){
            System.out.println("null");
        }
        else {
            System.out.println(s.substring(0,s.length()/2));
        }
    }
}
