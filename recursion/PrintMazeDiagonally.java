public class PrintMazeDiagonally {
    public static void Path(int n, int row,
                            int col, String ans) {
        if (row == n && col == n) {
            System.out.println(ans);
            return;
        }
        if (row > n || col > n) {
            return;
        }
        Path(n, row, col + 1, ans + "H");
        Path(n, row + 1, col, ans + "V");
        Path(n, row + 1, col + 1, ans + "D");
    }

    public static void main(String[] args) {
        Path(2, 0, 0, "");
    }
}