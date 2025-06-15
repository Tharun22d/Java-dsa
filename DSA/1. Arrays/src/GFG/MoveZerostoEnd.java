package GFG;
import java.util.*;

public class MoveZerostoEnd {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = input.nextInt();
        }

        int[] res = pushZerosToEnd(arr);
        System.out.println(Arrays.toString(res));

    }
    static int[] pushZerosToEnd(int[] arr) {
        int j = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }

        while(j<arr.length){
            arr[j] = 0;
            j++;
        }
        return arr;
    }
}
