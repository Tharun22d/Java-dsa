public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4, 5, 6,7};
        rev(arr);
    }
    static void rev(int[] arr){
        for(int i = arr.length-1 ; i>=0 ; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
