package DifferentSquares;

import java.util.HashSet;

class DifferentSquares {
    static void main(String[] args) {
        int[][] matrix ={{2,5,3,4,3,1,3,2}, {4,5,4,1,2,4,1,3}, {1,1,2,1,4,1,1,5}, {1,3,4,2,3,4,2,4}, {1,5,5,2,1,3,1,1}, {1,2,3,3,5,1,2,4}, {3,1,4,4,4,1,5,5}, {5,1,3,3,1,5,3,5}, {5,4,4,3,5,4,4,4}};
        System.out.println(differentSquares(matrix));
    }
    static int differentSquares(int[][] matrix) {
        HashSet<String> test = new HashSet<>();
        if(matrix.length == 1 || matrix[0].length == 1) return 0;
        for (int i = 0; i < matrix.length-1;i++)
            for (int j = 0; j < matrix[0].length - 1; j++)
                test.add("" + matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1] + " ");
        return test.size();
    }
}
