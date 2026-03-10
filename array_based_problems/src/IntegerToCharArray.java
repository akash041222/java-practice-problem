import java.util.*;
public class IntegerToCharArray {
    public static void main(String[] args) {
        int[] ascii={65,67,75,80,90,97,102,115};
        for(int i=0;i< ascii.length;i++){
            System.out.print(ascii[i]+" = ");
            System.out.println((char)ascii[i]);
        }
    }
}
