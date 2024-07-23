public class findSubsets {

        public static void main(String[] args) {
            int[] set = {2, 4, 6, 8};
            int targetSum = 10;
            int[] currentSubset = new int[set.length]; // Array to store the current subset

            findSubsets(set, targetSum, 0, currentSubset, 0);
        }

        public static void findSubsets(int[] set, int targetSum, int index, int[] currentSubset, int subsetSize) {
            // Base case: if target sum is 0, print the current subset
            if (targetSum == 0) {
                for (int i = 0; i < subsetSize; i++) {
                    System.out.print(currentSubset[i] + " ");
                }
                System.out.println();
                return;
            }

            // Base case: if index is out of bounds or target sum < 0, return
            if (index >= set.length || targetSum < 0) {
                return;
            }

            // Include the current element in the subset and recurse
            currentSubset[subsetSize] = set[index];
            findSubsets(set, targetSum - set[index], index + 1, currentSubset, subsetSize + 1);

            // Exclude the current element and recurse
            findSubsets(set, targetSum, index + 1, currentSubset, subsetSize);
        }
    }

