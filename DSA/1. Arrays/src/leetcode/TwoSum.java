/*

//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]

 */


package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] ques = {2,7,11,15};
        int target = 9;
        int[] res = calculate(ques,target);
        System.out.println(Arrays.toString(res));

    }
    static int[] calculate(int[] ques , int target){
        HashMap<Integer,Integer> two = new HashMap<>();
        for(int i = 0 ; i<ques.length ; i++){  //{}
            int comp = target - ques[i]; //9-2 = 7 //9-7 =2
            if(two.containsKey(comp)){  //false //true
                return new int[] {two.get(comp) , i};  //
            }
            two.put(ques[i],i);  //{2=0 , }
        }
        return new int[] {};
    }
}
