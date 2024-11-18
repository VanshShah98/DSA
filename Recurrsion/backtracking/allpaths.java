package Recurrsion.backtracking;

import java.util.Random;

public class allpaths {
    public static void main(String[] args) {
        boolean[][] maze = generateMaze(8, 0.4);
        pathRetWithObstracals("", 0, maze, 0);
        printMaze(maze);
    }

    public static boolean[][] generateMaze(int n, double obstacleProbability) {
        Random random = new Random();
        boolean[][] maze = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = random.nextDouble() > obstacleProbability;
            }
        }

        maze[0][0] = true;
        maze[n - 1][n - 1] = true;

        return maze;
    }

    public static void printMaze(boolean[][] maze) {
        for (boolean[] row : maze) {
            for (boolean cell : row) {
                System.out.print(cell ? "." : "#");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pathRetWithObstracals(String p, int r, boolean[][] maze, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // Backtracking starts "I am considering this block in my path. "
        maze[r][c] = false;
        if (r < maze.length - 1) {
            pathRetWithObstracals(p + " " + "D", r + 1, maze, c);
        }
        if (c < maze[0].length - 1) {
            pathRetWithObstracals(p + " " + "R", r, maze, c + 1);
        }
        if (r < maze.length - 1 && c < maze[0].length - 1) {
            pathRetWithObstracals(p + " " + "DI", r + 1, maze, c + 1);
        }
        if (r > 0) {
            pathRetWithObstracals(p + " " + "U", r - 1, maze, c);
        }
        if (c > 0) {
            pathRetWithObstracals(p + " " + "L", r, maze, c - 1);
        }
        // Once I am done with this cell i am reverting the changes made by this
        // fucntion for the next recurssion call to work properly
        maze[r][c] = true;
    }
}
