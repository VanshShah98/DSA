import java.util.Scanner;

public class N_QueenII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the board :  ");
        int n = in.nextInt();
        System.out.println("Total variation possible for the " + n + " X " + n + " board: " + totalNQueens(n));
        in.close();
    }

    public static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queen(board, 0);
    }

    private static int queen(boolean[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queen(board, row + 1);
                board[row][col] = false;
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
        int maxRigth = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRigth; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }
}
