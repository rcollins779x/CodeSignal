package Minesweeper;

import java.util.Arrays;

class Minesweeper {
    static void main (String[] args) {
        boolean[][] matrix = {{true,false,false,true},{false,false,true,false},{true,true,false,true}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                if (j != matrix[0].length - 1) System.out.print("\t");
            }
            System.out.println();
        }
        int[][] sum = minesweeper(matrix);
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j]);
                if (j != sum[0].length - 1) System.out.print("\t\t");
            }
            System.out.println();
        }
    }
    static int[][] minesweeper(boolean[][] matrix) {
        int[][] count = new int[matrix.length][matrix[0].length];
        int[][] sum = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[0].length; j++) {
                count[i][j] = (matrix[i][j]) ? 1 : 0;
                System.out.print(count[i][j]);
                if (j != count[0].length - 1) System.out.print("\t\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                if(i > 0) {
                    sum[i][j] += count[i - 1][j];           //up
                    if(j > 0)
                        sum[i][j] += count[i-1][j-1];       //top left
                    if(j < sum[0].length-1)                 //top right
                        sum[i][j] += count[i-1][j+1];
                }
                if(i < sum.length-1) {
                    sum[i][j] += count[i + 1][j];           //down
                    if (j < sum[0].length - 1)
                        sum[i][j] += count[i + 1][j + 1];   //bottom right
                    if (j > 0)
                        sum[i][j] += count[i + 1][j - 1];   //bottom left
                }
                if(j > 0)
                    sum[i][j] += count[i][j-1];             //left
                if(j < sum[i].length-1)
                    sum[i][j] += count[i][j+1];             //right
            }
        }
        return sum;
    }
}
