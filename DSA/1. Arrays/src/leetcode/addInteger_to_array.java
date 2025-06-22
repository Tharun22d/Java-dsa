
/*
989. Add to Array-Form of Integer
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

 */
package leetcode;
import java.util.*;

public class addInteger_to_array {
//    public List<Integer> addToArrayForm(int[] num, int k) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int i = num.length-1;
//        while(i>=0 || k>0){
//            if(i>=0){
//                k = k+num[i];
//                i--;
//            }
//
//            ans.add(0,k%10);
//            k = k/10;
//
//        }
//
//        return ans;
//    }
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num,k));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        //[1,2,0,0] 34
        int i = num.length-1;
        while(k>0){
            k = k+num[i];
            int rem = k%10;
            num[i] = rem;
            k=k/10;
            i--;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int j = num.length-1 ; j>=0;j--){
            ans.add(0,num[j]);
        }
        return ans;
    }
}
