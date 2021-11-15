package SudokuChecker;

import java.util.HashSet;

class SudokuChecker {
    static void main(String[] args) {
        int[][] grid = {{1,3,2,5,4,6,9,8,7},
                        {4,6,5,8,7,9,3,2,1},
                        {7,9,8,2,1,3,6,5,4},
                        {9,2,1,4,3,5,8,7,6},
                        {3,5,4,7,6,8,2,1,9},
                        {6,8,7,1,9,2,5,4,3},
                        {5,4,6,9,8,1,4,3,2},
                        {2,7,3,6,5,7,1,9,8},
                        {8,1,9,3,2,4,7,6,5}};
        System.out.println(sudoku(grid));
    }
    static boolean sudoku(int[][] grid) {
        for (int j = 0; j < 9; j++) {
            HashSet<Integer> rows = new HashSet<>();
            HashSet<Integer> cols = new HashSet<>();
            for (int i = 0; i < grid.length; i++) {
                rows.add(grid[i][j]);
                cols.add(grid[j][i]);
            }
            if (rows.size() != 9 || cols.size() != 9) return false;
        }
        HashSet<Integer> box = new HashSet<>();
        for (int ver = 0; ver < 9; ver += 3)
            for (int hor = 0; hor < 9; hor += 3) {
                for (int row = 0; row < 3; row++)
                    for (int col = 0; col < 3; col++) box.add(grid[row + ver][col + hor]);
                if (box.size() != 9) return false;
                box = new HashSet<>();
            }
        return true;
    }
}
