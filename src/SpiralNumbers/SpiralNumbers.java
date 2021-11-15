package SpiralNumbers;

class SpiralNumbers {
    static void main(String[] args) {
        int n = 6;
        int[][] temp = spiralNumbers(n);
        for (int[] ints : temp)
            for (int col = 0; col < temp.length; col++)
                System.out.print(ints[col] + "\t" + ((col + 1) % n == 0 ? "\n" : ""));
    }
    static int[][] spiralNumbers(int n) {
        int[][] spiral = new int[n][n];
        for (int count = 0, min = 0, max = n - 1, row = 0, col = -1; count < n * n; max--,min++) {
            while (col < max) spiral[row][++col] = ++count;
            while (row < max) spiral[++row][col] = ++count;
            while (col > min) spiral[row][--col] = ++count;
            while (row > min+1) spiral[--row][col] = ++count;
        }
        return spiral;
    }
}
