import java.util.HashSet;
import java.util.Set;

public class containsDuplicatesII {
   public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k)
                set.remove(nums[i - k - 1]);
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean ans = containsNearbyDuplicate(nums,k);
        System.out.println(ans);
    }

}
