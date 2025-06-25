/*
Identify the Square root of the String without math methods
binary search example

 */

package Searching;

public class Square_root {
    public int mySqrt(int x) {

        if(x==0 || x == 1){
            return x;
        }

        int left = 1;
        int right = x/2;
        int ans = 0;

        while(left<=right){
            int mid = (int)Math.floor(left + (right - left)/2);
            long check = (long) mid*mid;  //mid may be a longer value

            if(check == x){
                return mid;
            }
            else if(check > x){
                right = mid-1;
            }
            else{
                ans = mid;
                left = mid+1;
            }
        }

        return ans;
    }
}
