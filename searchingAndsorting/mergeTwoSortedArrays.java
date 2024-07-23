import java.util.Arrays;
public class mergeTwoSortedArrays {
    public static int[] mergeSortedArrays(int[] one,
                                          int[] two) {
        int[] merged = new int[one.length + two.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < one.length && j < two.length) {

            if (one[i] < two[j]) {
                merged[k] = one[i];
                i++;
                k++;
            } else {
                merged[k] = two[j];
                j++;
                k++;
            }

        }

        // two array finish, one array elements consume
        if (j == two.length) {

            while (i < one.length) {
                merged[k] = one[i];
                i++;
                k++;
            }

        }

        // one array finish, two array elements consume
        if (i == one.length) {

            while (j < two.length) {
                merged[k] = two[j];
                j++;
                k++;
            }

        }

        return merged;

    }

    public static void main(String[] args) {
        int[] arr1 = {10,30,50,80,100,200};
        int[] arr2 = {20,40,60};

        int[] ans = mergeSortedArrays(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
