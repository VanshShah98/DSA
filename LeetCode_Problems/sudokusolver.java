public class sudokusolver {
    public static void main(String[] args) {
        char[][] board = {
                { '.', '8', '7', '6', '5', '4', '3', '2', '1' },
                { '2', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '3', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '4', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '5', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '6', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '7', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '8', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '9', '.', '.', '.', '.', '.', '.', '.', '.' }
        };

        if (solve(board)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean EL = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    EL = false;
                    break;
                }
            }
            if (!EL) {
                break;
            }
        }

        if (EL) {
            return true;
        }
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                }
                board[row][col] = '.';

            }

        }
        return false;
    }

    private static void display(char[][] board) {
        for (char[] row : board) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(char[][] board, int row, int col, char number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number || board[i][col] == number) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == number) {
                    return false;
                }
            }
        }
        return true;
    }
}
