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
        int r = 0;
        int c = 0;
        int count = 0;
        while (count < (m * n)) {
            if (c < n - 1 && r == 0) {
                ans.add(matrix[0][c]);
                c = c + 1;
                System.out.println("C in 1st Row : " + c);
                count++;
            }
            if (r < m - 1 && c == n - 1) {
                System.out.println("R = " + r);
                ans.add(matrix[r][c]);
                System.out.println("Number Added : " + matrix[r][c]);
                r++;
                count++;

            }
            if (c > 0 && r == m - 1) {
                ans.add(matrix[r][c]);
                System.out.println("C in " + r + " is " + c);
                c--;
                count++;
                count++;

            }
            if (r > 0 && c == 0) {
                ans.add(matrix[r][c]);
                System.out.println(" R in here : " + r);
                r--;
                ans.add(matrix[r][c]);
                System.out.println(" R in here : " + r);
                count++;
            }
            // if (r > 0 && c < n - 1) {
            // ans.add(matrix[r][c]);
            // c++;
            // count++;
            // }

        }
        System.out.println(m * n);
        System.out.println(count);
        return ans;
    }

}