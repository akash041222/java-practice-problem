import java.util.*;
public class WordAbbreviation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word=input.nextLine();
        String result="";
        if(word.length()>10){
            result=word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1);
            System.out.println("Output: "+result);
        }
        else{
            System.out.println("Output: "+word);
        }
    }
}
