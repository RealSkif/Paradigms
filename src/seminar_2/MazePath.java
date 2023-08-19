package seminar_2;

import java.util.Stack;

public class MazePath {
    public static void main(String[] args) {
        char[][] maze = {
                {'0', '1', '0', '0', '0'},
                {'0', '1', '0', '1', '0'},
                {'0', '0', '0', '1', '0'},
                {'0', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        int[] start = {0, 0};
        int[] end = {4, 4};

        int rows = maze.length;
        int cols = maze[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        int[][] stack = new int[rows * cols][2];
        int stackSize = 1;
        stack[0] = start;

        int stackIndex = 0;

        while (stackSize > 0) {
            int[] current = stack[stackIndex];
            int x = current[0];
            int y = current[1];

            visited[x][y] = true;

            if (x == end[0] && y == end[1]) {
                System.out.println("Путь:");
                for (int i = 0; i < stackSize; i++) {
                    System.out.println("(" + stack[i][0] + ", " + stack[i][1] + ")");
                }
                return;
            }

            boolean foundNextMove = false;

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols
                        && maze[newX][newY] == '0' && !visited[newX][newY]) {
                    stack[stackSize] = new int[]{newX, newY};
                    stackSize++;
                    foundNextMove = true;
                    break;
                }
            }
            if (!foundNextMove) {
                stackSize--;
                stackIndex--;
            } else {
                stackIndex++;
            }
        }
    }
}
