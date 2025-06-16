package GFG;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the values of the array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = input.nextInt();
        }

        int[] res = reverseArray(arr);
        System.out.print(Arrays.toString(res));

    }
    public static int[] reverseArray(int arr[]) {
        for(int i = 0 , j =arr.length-1 ; i<j ; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}
