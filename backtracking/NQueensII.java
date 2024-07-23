public class NQueensII {
    static int count = 0;
        public static void main(String[] args) {
             NQueen2(new boolean[4][4], 0, "");
            System.out.println("Total ways to place all " +
                    "Queens are = "+count);
        }

        public static void NQueen2(boolean[][] board,
                                   int row, String ans) {

            if (row == board.length) {
                System.out.println(ans);
                count++;
                return;
            }

            for (int col = 0; col < board[0].length; col++) {
                if (isItSafeToPlaceQueen(board, row, col)) {

                    board[row][col] = true;
                    NQueen2(board, row + 1,
                            ans + "[" + row + "-" + col + "] ");
                    board[row][col] = false;
                }
            }
        }

    public static boolean isItSafeToPlaceQueen(boolean[][] board,
                                               int row, int col) {
        // vertically up
        int r = row - 1;
        int c = col;

        while (r >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
        }

        // horizontally left
        r = row;
        c = col - 1;

        while (c >= 0) {
            if (board[r][c]) {
                return false;
            }
            c--;
        }

        // diagonally left
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // diagonally right
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;

    }
}
