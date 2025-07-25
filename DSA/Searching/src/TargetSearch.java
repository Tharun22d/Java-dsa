public class TargetSearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,5,6,6,8,9,10};
        int target = 7;
        System.out.println(solve(arr, target));
    }
    static int solve(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2 ;
            if(arr[mid] >target){
                right = mid -1;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                return mid;  //if value is equal
            }
        }
        return arr[left]; // return the value >= target
    }
}