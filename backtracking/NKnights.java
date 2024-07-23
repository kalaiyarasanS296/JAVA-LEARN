public class NKnights {
    static int count = 0;

    public static void main(String[] args) {
        NKnights(new boolean[3][3], 0, 0, 3, 0, "");

        System.out.println("Total ways to " +
                "place all Knights are = " + count);
    }

    public static boolean isItSafeToPlaceKnight(boolean[][] board,
                                                int row, int col) {

        int[] rowArr = { -1, -2, -2, -1 };
        int[] colArr = { 2, 1, -1, -2 };

        for (int i = 0; i < rowArr.length; i++) {

            int nr = row + rowArr[i];
            int nc = col + colArr[i];

            if (nr >= 0 && nr < board.length &&
                    nc >= 0 && nc < board[0].length) {

                if (board[nr][nc]) {
                    return false;
                }
            }

        }

        return true;

    }

    public static void NKnights(boolean[][] board, int row, int col, int tk, int qksf, String ans) {

        if (qksf == tk) {
            System.out.println(++count + " : " + ans);
            return;
        }

        if (col == board[0].length) {
            row++;
            col = 0;
        }

        if (row == board.length) {
            return;
        }

        // place

        if (isItSafeToPlaceKnight(board, row, col)) {
            board[row][col] = true;
            NKnights(board, row, col + 1, tk, qksf + 1, ans + "[" + row + "-" + col + "]");
            board[row][col] = false;
        }

        // not place
        NKnights(board, row, col + 1, tk, qksf, ans);
    }

}
