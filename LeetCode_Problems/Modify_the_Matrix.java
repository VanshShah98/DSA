
/**
 * Q3033 Fidelity interview question
 * Given a 0-indexed m x n integer matrix matrix, create a new 0-indexed matrix
 * called answer. Make answer equal to matrix, then replace each element with
 * the value -1 with the maximum element in its respective column.
 * 
 * Return the matrix answer.
 */
public class Modify_the_Matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, -1 }, { 4, -1, 6 }, { 7, 8, 9 } }; // Test Case 1
        // int[][] matrix = { { 3, -1 }, { 5, 2 } }; //Test case 2
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        modifiedMatrix(matrix);
        System.out.println();
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] modifiedMatrix(int[][] matrix) {
        int[][] answer = matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (answer[i][j] == -1) {
                    answer[i][j] = largestInColumn(answer, j);
                }
            }
        }

        return answer;

    }

    public static int largestInColumn(int[][] matrix, int column) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] > max) {
                max = matrix[i][column];
            }
        }

        return max;
    }
}