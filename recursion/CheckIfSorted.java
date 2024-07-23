public class CheckIfSorted {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        boolean ans = isSorted(arr, i + 1);
        return ans;
    }
        public static void main(String[] args)
        {
            int arr[] = {20, 23, 3, 50, 78};
            System.out.println(isSorted(arr, 0));
        }
    }


