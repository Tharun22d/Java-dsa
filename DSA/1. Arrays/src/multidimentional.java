import java.util.Scanner;

//2d array
public class multidimentional {
        public static void main(String[] args) {
//            int[][] matrix = {
//                    {1,2,3}, //0 index  //length  = 3
//                    {2,3,4,5}, //1 index  //length = 4
//                    {4,5,6,7}  //2 index  //length = 4
//            };
            Scanner input = new Scanner(System.in);
            //type[] name = new type[]
            int[][] matrix = new int[3][3];

            for(int i =0 ; i<3 ; i++){
                for(int j = 0 ; j<3 ; j++){
                    matrix[i][j] = input.nextInt();
                }
            }


            for(int i = 0 ; i<matrix.length;i++){  //0index
                for(int j = 0; j<matrix[i].length;j++){  //0 ; mat[0].length = 3  //1 //mat[0].length = 3 //2
                    System.out.print(matrix[i][j] + " ");   //mat[0][0] = 1  //mat[0][1] = 2   //mat[0][2] = 3
                }
                System.out.println();
            }
        }

}
