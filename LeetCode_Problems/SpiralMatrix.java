import java.util.ArrayList;
import java.util.List;

//TO DO
/**
 * SpiralMatrix
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // [1,2,3,6,9,8,7,4,5]
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        while (i < m) {
            while (j < n) {
                if (j == m) {
                }
            }
        }
        return ans;
    }

}