package Dynamicprogramming.boardPath;

public class BoardPath {

	public static void main(String[] args) {

		int n = 4;
//		System.out.println(BPRecursion(0, n));
//		System.out.println(BPTD(0, n, new long[n]));
		System.out.println(BPBU(n));

	}

	public static int BPRecursion(int curr, int end) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int BP1 = BPRecursion(curr + 1, end);
		int BP2 = BPRecursion(curr + 2, end);
		int BP3 = BPRecursion(curr + 3, end);

		int ans = BP1 + BP2 + BP3;
		return ans;

	}

	public static long BPTD(int curr, int end, long[] strg) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (strg[curr] != 0) { // re-use
			return strg[curr];
		}

		long BP1 = BPTD(curr + 1, end, strg);
		long BP2 = BPTD(curr + 2, end, strg);
		long BP3 = BPTD(curr + 3, end, strg);

		long ans = BP1 + BP2 + BP3;
		strg[curr] = ans; // store

		return ans;
	}

	public static int BPBU(int end) {

		int[] strg = new int[end + 3];

		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3];
		}

		return strg[0];
	}

}
