import java.util.*;

public class PivotSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length ;i++){
            arr[i] = input.nextInt();
        }
        int res = pivot(arr);
        System.out.println(res);
    }
    static int pivot(int[] arr){

        for(int i = 0 ; i<arr.length ; i++){

            int l_sum = 0; //Since both l_sum and r_sum depend on the current index i,
            int r_sum = 0; // you have to 'compute them freshly' for each index.

            for(int j = 0; j<i ;j++){
                l_sum = l_sum+arr[j];
            }

            for(int k = i+1 ; k<arr.length ; k++){
                r_sum = r_sum +  arr[k];
            }

            if(l_sum == r_sum) {
                return i;
            }
        }
        return -1;
    }
}
