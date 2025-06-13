//print the maximum in an array

public class maximumArray {
    public static void main(String[] args){
        int[] arr = {2,3,4,66,77,88};
        int a = max(arr);
        System.out.println(a);
    }
    static int max(int[] arr){
        int largest = arr[0];

        for(int i = 1 ; i < arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
