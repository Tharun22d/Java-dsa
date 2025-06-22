/*
You are given an array of integer arr[] where each number represents a vote to a candidate.
Return the candidates that have votes greater than one-third of the total votes,
If there's not a majority vote, return an empty array.

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.

approach : Using hashMap first count the frequencies and put in hashMap
           itreate throgh for each loop then check whether any value is >n/3
           add its key to a arraylist and return the final arrayList
           sort if required : Collections.sort();
 */


package GFG;
import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i =0 ; i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(calculate(arr));

    }
        static ArrayList<Integer> calculate(int[] nums){
            //hashmap implementation
            HashMap<Integer, Integer> dup = new HashMap<>();
            //add values to hashmap
            for(int i = 0 ; i < nums.length; i++){
                int num = nums[i];
                int count = dup.getOrDefault(num,0);
                dup.put(num,count+1);
            }

            ArrayList<Integer> ans = new ArrayList<>();
            int n = nums.length ;

            //itratre through each entrySet of hasmap to find the value
            for(Map.Entry<Integer,Integer> i : dup.entrySet()){
                int key = i.getKey();
                int val = i.getValue();

                if(val > n/3){
                    ans.add(key);
                }
            }

            return ans;
        }


}
