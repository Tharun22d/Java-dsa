//2d Arraylist

import java.util.*;

public class multidimentionalAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> name = new ArrayList<>();  // name = { } -- no rows

        for(int i = 0 ; i<3 ; i++){
            name.add(new ArrayList<>());      // name = { { }, { } , { } };   - rows created
        }

        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                name.get(i).add(input.nextInt());    //fro every jth value add value to the ith row
            }
        }

//        for(int i = 0 ; i<3; i++){
//            for(int j = 0 ; j<3 ; j++){
//                System.out.print(name.get(i).get(j));
//            }
//            System.out.println();
//        }

        System.out.println(name);
    }
}
