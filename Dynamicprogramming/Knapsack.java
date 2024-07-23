package Dynamicprogramming;

public class Knapsack {
	public static void main(String[] args) {
		int[] wt = { 1, 3, 4, 5 };
		int[] price = { 1, 4, 5, 7 };
		int cap = 7;
		 System.out.println(KnapsackRecursion(wt, price,
				 0, cap));
	}
	public static int KnapsackRecursion(int[] wt,
										int[] price, int idx,
										int cap) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}
		// exclude
		int exclude = KnapsackRecursion(wt, price,
				idx + 1, cap);
		// include
		int include = 0;
		if (cap >= wt[idx])
			include = KnapsackRecursion(wt, price,
					idx + 1, cap - wt[idx]) + price[idx];
		int ans = Math.max(exclude, include);
		return ans;
	}

	public static int KnapsackTD(int[] wt, int[] price,
								 int vidx, int cap,
								 int[][] strg) {

		if (vidx == wt.length || cap == 0) {
			return 0;
		}

		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}

		// exclude
		int e = KnapsackTD(wt, price, vidx + 1,
				cap, strg);

		// include
		int i = 0;

		if (cap >= wt[vidx])
			i = KnapsackTD(wt, price, vidx + 1,
					cap - wt[vidx], strg) + price[vidx];

		int ans = Math.max(e, i);

		strg[vidx][cap] = ans;

		return ans;

	}

	public static int KnapsackBU(int[] wt, int[] price, int cap) {

		int n = wt.length;

		int[][] strg = new int[n + 1][cap + 1];

		for (int row = n - 1; row >= 0; row--) {

			for (int col = 1; col <= cap; col++) {

				int e = strg[row + 1][col];
				int i = 0;
				if (col >= wt[row])
					i = strg[row + 1][col - wt[row]] + price[row];

				int ans = Math.max(e, i);

				strg[row][col] = ans;

			}
		}

		
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				System.out.print(strg[i][j] + " ");
			}
			System.out.println();
		}
		return strg[0][cap];

	}

}


//System.out.println(KnapsackTD(wt, price, 0, cap, new int[wt.length][cap + 1]));
//System.out.println(KnapsackBU(wt, price, cap));
