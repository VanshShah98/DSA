package Recurrsion.backtracking;

import java.util.ArrayList;
import java.util.Random;

public class maze {
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

    public static int Ways(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = Ways(r - 1, c);
        int right = Ways(r, c - 1);
        return left + right;
    }

    public static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + " " + "D", r - 1, c);
        }
        if (c > 1) {
            path(p + " " + "R", r, c - 1);
        }

    }

    public static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + " " + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + " " + "R", r, c - 1));
        }
        System.out.println(list.size());
        return list;

    }

    public static ArrayList<String> pathRetWithDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRetWithDiagonal(p + " " + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetWithDiagonal(p + " " + "R", r, c - 1));
        }
        if (r > 1 && c > 1) {
            list.addAll(pathRetWithDiagonal(p + " " + "DI", r - 1, c - 1));
        }
        System.out.println(list.size());
        return list;

    }

    public static void pathRetWithObstracals(String p, int r, boolean[][] maze, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRetWithObstracals(p + " " + "D", r + 1, maze, c);
        }
        if (c < maze[0].length - 1) {
            pathRetWithObstracals(p + " " + "R", r, maze, c + 1);
        }
        if (r < maze.length - 1 && c < maze[0].length - 1) {
            pathRetWithObstracals(p + " " + "DI", r + 1, maze, c + 1);
        }
    }
}
