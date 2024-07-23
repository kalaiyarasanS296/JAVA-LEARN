package sarching.recursive;

public class RecursiveBS {
        public static int binarySearch(int[] nums, int low,
                                       int high, int target) {

            //negative Base case.
            if (low > high) {
                return -1;
            }
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (target > nums[mid]) {
                int idx = binarySearch(nums, mid + 1,
                        high, target);

                return idx;
            }else{

                int idx = binarySearch(nums, low, mid - 1,
                        target);

                return idx;
            }
        }


        public static void main(String[] args) {
            int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
            int target = 6;
            int ind = binarySearch(a,0,a.length - 1,target);
            if (ind == -1) {
                System.out.println("The target is not present.");
            }
            else {
                System.out.println("The target is at index: " + ind);
            }
        }
    }

