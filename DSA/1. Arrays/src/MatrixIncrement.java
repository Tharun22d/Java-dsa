import java.util.*;

public class MatrixIncrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                {0,0,0} ,
                {0,0,0,}
        };
        System.out.println("Enter the row to increment : ");
        int row = input.nextInt();
        System.out.println("Enter the col to increment : ");
        int col = input.nextInt();
//        for(int i = row ; i<=row ; i++){
//            for(int j = 0 ; j<arr[i].length;j++){
//                arr[i][j]++;
//            }
//        }
        //or

        for(int j = 0 ; j<arr[row].length; j++){
            arr[row][j]++;
        }

        for(int i = 0 ; i<arr.length;i++){
            arr[i][col]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i])); //.toString already has a loop inside so it handles the inner j loop
        }
    }
}
