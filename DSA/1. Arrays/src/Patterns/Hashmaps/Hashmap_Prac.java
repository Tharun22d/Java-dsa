package Patterns.Hashmaps;
import java.util.*;

public class Hashmap_Prac {
        public static void main(String[] args) {
            int[] arr = new int[2];
            int[] nums = {3,2,4};
            int target = 6;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0 ; i<nums.length ; i++){
                int num = nums[i];
                int value = Math.abs(target-num);
                map.put(num,value);
            }

            for(Map.Entry<Integer,Integer> i: map.entrySet()){
                int key = i.getKey();
                int value = i.getValue();
                 int tot = key + value;
                 int k_index = 0;
                 int v_index = 0;
                 if(tot==target){

                 }
                System.out.println(k_index+ " " + v_index);
//

            }

        }
}
