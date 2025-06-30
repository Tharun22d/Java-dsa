package Patterns.Hashmaps;
import java.util.*;

public class Hashmap_Prac {
        public static void main(String[] args) {
            int[] arr = new int[2];
            int[] nums = {3,3,4};
            int target = 6;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0 ; i<nums.length ; i++){
                int num = nums[i];
                int val = target - num;
                if(map.containsKey(val)){
                    System.out.println(map.get(val) + " " + i);
                }
                else {
                    map.put(num, i);
                }
            }



        }
}
