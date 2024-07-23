package graphs.NoOfIslands;

public class NumberofIslands_dfs {
        public static void dfs(int row, int col,
                               int[][] vis, char[][] grid) {
            int n = grid.length;
            int m = grid[0].length;

            // Mark the cell as visited
            vis[row][col] = 1;

            // Directions for traversal: up, right, down, left
            int[] drow = {-1, 0, +1, 0};
            int[] dcol = {0, +1, 0, -1};

            // Traverse all 4 directions
            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                // Check if the new cell is valid, unvisited, and is land
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && grid[nrow][ncol] == '1'
                        && vis[nrow][ncol] == 0) {
                    dfs(nrow, ncol, vis, grid);
                }
            }
        }

        // Function to find the number of islands.
        public static int numIslands(char[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int[][] vis = new int[n][m];
            int cnt = 0;

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    // If not visited and is a land
                    if (vis[row][col] == 0 &&
                            grid[row][col] == '1') {
                        dfs(row, col, vis, grid);
                        cnt++;

                    }
                }
            }

            return cnt;
        }

        public static void main(String[] args) {
            char[][] grid = {
                    {'1','1','0','1','1'},
                    {'1','0','0','0','0'},
                    {'0','0','0','0','1'},
                    {'1','1','0','1','1'}
            };

            System.out.println(numIslands(grid));
        }
    }

