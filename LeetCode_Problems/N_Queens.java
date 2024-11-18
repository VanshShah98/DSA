
import java.util.*;

/*
    The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

    Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

    Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
 */
public class N_Queens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        queens(board, 0, ans);
        // System.out.println(ans);
    }

    public static int queens(boolean[][] board, int rows, List<List<String>> ans) {
        if (rows == board.length) {
            ans.add(display(board));
            display2(board);
            return 1;
        }
        int count = 0;
        for (int cols = 0; cols < board.length; cols++) {
            if (isSafe(board, rows, cols)) {
                board[rows][cols] = true;
                count += queens(board, rows + 1, ans);
                board[rows][cols] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }

        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    private static List<String> display(boolean[][] board) {
        List<String> result = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder res = new StringBuilder();
            for (boolean element : row) {
                if (element) {
                    res.append("Q");
                } else {
                    res.append(".");
                }
            }
            result.add(res.toString());
        }

        return result;
    }

    private static void display2(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q" + " ");
                } else {
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
