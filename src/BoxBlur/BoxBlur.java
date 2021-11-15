package BoxBlur;

class BoxBlur {
    static void main (String[] args) {
        int[][] image = {{36,0,18,9},{27,54,9,0},{81,63,72,45}};
        for (int[] ints : image) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(ints[j]);
                if (j != image[0].length - 1) System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
        image = boxBlur(image);
        for (int[] ints : image) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(ints[j]);
                if (j != image[0].length - 1) System.out.print("\t");
            }
            System.out.println();
        }
    }
    static int[][] boxBlur(int[][] image) {
        int[][] result = new int [image.length][image[0].length];
        for (int row = 0; row < image.length; row++) System.arraycopy(image[row], 0, result[row], 0, image[row].length);
        for (int r = 1; r < image.length - 1;r++) {
            for (int c = 1; c < image[0].length - 1;c++) {
                int sum = 0;
                for (int i = r - 1; i <= r + 1; i++) {
                    for (int j = c - 1; j <= c + 1; j++) {
                        //System.out.print("[" + i + "][" + j + "]" + image[i][j] + "\t");
                        sum += image[i][j];
                    }
                    //System.out.println();
                }
                result[r][c] = sum / 9;
            }
        }
        int[][] last = new int[image.length - 2][image[0].length - 2];
        for (int r = 0; r < image.length - 2; r++)
            if (image[0].length - 2 >= 0) System.arraycopy(result[r + 1], 1, last[r], 0, image[0].length - 2);
        return last;
    }
}
