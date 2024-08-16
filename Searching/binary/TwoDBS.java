import java.util.Arrays;
import java.util.Scanner;

class TwoDBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int r = sc.nextInt();
        System.out.print("Enter Col : ");
        int c = sc.nextInt();
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(Arrays.toString(searchBS(mat, target)));

    }

    static int[] searchBS(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}