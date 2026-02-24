/*
Given a string containing multiple items separated by semicolons (;),
where each item consists of a word followed by a numeric value
separated by a space, write a program to find and print the word
with the minimum numeric value.

Example Input: "laptop 100;mobile 21;tv 123"
Example Output: Word with minimum value: mobile
*/

public class FindMinValueWord {
    public static void main(String[] args) {
        String str = "laptop 100;mobile 21;tv 123";
        String[] arr = str.split(";");
        int min_value = Integer.MAX_VALUE;
        String min_word = "";
        for(int i=0; i<arr.length;i++){
            String[] temp = arr[i].split(" ");
            int value = Integer.parseInt(temp[1]);
            if(value<min_value){
                min_value=value;
                min_word=temp[0];
            }
        }
        System.out.println("Word with minimum value: "+min_word);
    }
}