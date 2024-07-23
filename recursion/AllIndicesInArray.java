public class AllIndicesInArray {
    public static void AllIndicies(int[] arr,
                                   int idx, int key){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.println(idx);
        }
        AllIndicies(arr,idx+1,key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,10,2,5,3,2};
        AllIndicies(arr,0,2);
    }
}
