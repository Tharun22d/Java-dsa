public class MaximimumRange {
    public static void main(String[] args) {
        int[] arr = {1, 222, 3,45, 6, 7};
        System.out.println(max(arr , 1 , 5));
    }
    static int max(int[] arr , int index1 , int index2){
        if (arr.length == 0 ){
            return -1;
        }
        int maximum = arr[index1];
        for(int i = index1 ; i<=index2;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
