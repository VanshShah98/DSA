
public class CountNegative {
    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int i = 0;
        int j = grid[0].length - 1;
        while (i < grid.length && j >= 0) {
            if (grid[i][j] >= 0) {
                i++;
            } else {
                count += (grid.length - i);
                j--;
            }
        }
        return count;

    }

    public static int countNegatives2(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
