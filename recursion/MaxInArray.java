public class MaxInArray {
    static int max = 0;
    public static void MaxArray(int[] arr, int idx){

        if(idx == arr.length){
            return;
        }
        if(arr[idx] > max){
            max = arr[idx];
        }
        MaxArray(arr,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,30,50};
        MaxArray(arr,0);
        System.out.println(max);
    }
}
