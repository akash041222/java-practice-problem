import java.util.*;
public class SearchElement{
    public static void main(String[] args) {
        int[] arr={1,4,34,56,7};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the search element: ");
        int search=input.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                index=i;
            }
        }
        System.out.println("Element found at index: "+index);
    }
}
