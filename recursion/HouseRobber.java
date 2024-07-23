import java.io.*;

public class HouseRobber {
      public static int HouseRobberRecursion(int val[], int n)
        {
            // base case
            if (n < 0) {
                return 0;
            }

            if (n == 0) {
                return val[0];
            }

            int pick = val[n] + HouseRobberRecursion(val, n - 2);
            int notPick = HouseRobberRecursion(val, n - 1);

            return Math.max(pick, notPick);
        }

      public static int HouseRobberDP(int[] nums) {

            // If only 1 element, just return it
            if (nums.length < 2)
                return nums[0];

            // Create array to store the maximum loot at each index
            int[] dp = new int[nums.length];

            // Memoize maximum loots at first 2 indexes
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);

            // Use them to fill complete array
            for (int i = 2; i < nums.length; i++) {

                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }

            return dp[nums.length - 1];
        }

        public static void main(String[] args)
        {
            int val[] = { 6, 7, 1, 3, 8, 2, 4 };
            int n = val.length;
            System.out.println("Maximum rob possible : "
                    + HouseRobberRecursion(val, n-1));

            System.out.println("Dynamic Programming");
            System.out.println(HouseRobberDP(val));

        }

    }

