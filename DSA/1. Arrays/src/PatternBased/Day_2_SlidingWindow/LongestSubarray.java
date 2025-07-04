package PatternBased.Day_2_SlidingWindoe;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,10,10};
        System.out.println(calculate(arr));
    }
    static int calculate(int[]arr){
        int l = 0 ;
        int r = 0;
        int k = 14;
        int maxcount = 0;
        int sum = arr[0];
        while(r<arr.length){
            if(sum>k){
                sum = sum - arr[l];
                l++;
            }
            else{
                maxcount = Math.max(maxcount,(r-l+1)); //maximum length of the subarray which value <=14
                r++;
                if(r<arr.length) {
                    sum = sum + arr[r];
                }
            }
        }
        return maxcount;
    }
}
