public class searchInsertPosition {
    public static int search(int i, int[] nums, int target){

        if( i == nums.length || nums[i] >= target){
            return i;
        }

        return search(i+1,nums,target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = search(0,arr, x);
        System.out.println("The index is: " + ind);
    }
}
