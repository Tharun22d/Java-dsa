//count the frequency of each value and retun the highets frequency values key
// if the max value are same the print the first occurance

package PatternBased.Hashmaps;

import java.util.HashMap;

public class One_MaxFrequency {
    public static void main(String[] args){
        int[] arr = {2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6};
        int res = calculate(arr);
        System.out.println(res);
    }
    static int calculate(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int max = Integer.MIN_VALUE;
        int result = -1;

        //since the order is in same as the array , so instead of ireating map we are itreating over the array
        for (int num : arr){
            int freq = map.get(num); //gets the value;
            if(freq>max){
                max = freq;
                result = num;
            }
        }
        return result;
    }
}
